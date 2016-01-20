//solved
package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FindDigits {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int m=n;
            int c=0;
            while(m!=0){
                int rem=m%10;
                if(rem!=0 && n%rem==0)
                    c++;
                m=m/10;
            }
            pw.println(c);
        }        
        pw.close();
    }
}
