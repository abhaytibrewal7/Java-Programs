//solved
package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class kefaAndFirstSteps {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
            a[i]=Integer.parseInt(s[i]);
        int current_max=1;
        int max=0;
        for(int i=1;i<n;i++){
            if(a[i]>=a[i-1]){
                current_max++;                
            }
            else{
                max=Math.max(max, current_max);            
                current_max=1;
            }
        }
        pw.println(Math.max(max, current_max));    
        pw.close();       
    }
}
