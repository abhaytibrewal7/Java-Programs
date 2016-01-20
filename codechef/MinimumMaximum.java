package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

class MinimumMaximum {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            int a[]=new int[n];
            String s[]=br.readLine().split(" ");
            int min=Integer.MAX_VALUE;
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);
                if(a[i] < min){
                    min=a[i];
                }                    
            }
            long res=(long)min*(n-1);
            pw.println(res);
        }        
        pw.close();
    }
}
