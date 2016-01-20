//solved

package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CountSubarrays {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            long a[]=new long[n];
            String s[]=br.readLine().split(" ");
            long c=0;
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);                
            }
            int flag=0;
            long k=1;
            for(int i=1;i<n;i++){
                flag=0;
                k=1;
                while(i<n && a[i] >= a[i-1]){
                    k++;
                    i++;
                    flag=1;
                }      
                if(flag==1){
                    c = (c+ (k * (k+1))/2) - k;                    
                }
            }
            pw.println(c+n);
        }                
        pw.close();
    }
}
