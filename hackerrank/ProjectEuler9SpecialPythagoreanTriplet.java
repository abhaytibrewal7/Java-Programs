//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class  ProjectEuler9SpecialPythagoreanTriplet{
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int x= (int)Math.pow(n, 2);
            int p=1,max=1;
            for(int i=n/2-1;i>=1;i--){
                int b = (x - (2*i*n))%(2*(n-i));
                if(b == 0){
                    b=(x - (2*i*n))/(2*(n-i));
                    p = b*i*(n-i-b);
                    if(p >  max)
                        max=p;
                }
            }
            if(max==1)
                pw.println("-1");
            else
                pw.println(max);
        }
        pw.close();
    }
}
