//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;

class ProjectEuler13LargeSum {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int n=Integer.parseInt(br.readLine());
        BigDecimal arr[]=new BigDecimal[n];
        BigDecimal sum=new BigDecimal(0);
        for(int i=0;i<n;i++){
            BigDecimal a = new BigDecimal(br.readLine());
            sum = sum.add(a);
        }
        String s = sum.toString();
        for(int i=0;i<10;i++)
            pw.print(s.charAt(i));
        pw.println();
        pw.close();
    }
}
