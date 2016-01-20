
///////wrong ans

package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class StrangeOperations {
    public static void main(String args[])throws IOException{
     
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int t=Integer.parseInt(br.readLine());
        
        while(t-->0){
            String s[]=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            double sum=0;
            double a[]=new double[n];
            String s1[]=br.readLine().split(" ");
            for(int i=0;i<n;i++){
                a[i]=Double.parseDouble(s1[i]);
                sum=sum+a[i];
            }
            double new_num=0;
            for(int i=0;i<k;i++){
                new_num=sum+1;
                sum=sum+new_num;
            }
            if(new_num%2==0){
                   pw.println("even");
            }
            else{
                pw.println("odd");
            }                
        }
        pw.close();
    }
}
