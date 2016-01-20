//solved
package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;


public class UtopianTree {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int h=1;
            int flag=0;
            for(int i=0;i<n;i++){
                if(flag==0){
                    h=h*2;
                    flag=1;
                }
                else if(flag==1){
                    h+=1;
                    flag=0;
                }
            }
            pw.println(h);
        }
        pw.close();
    }
}
