//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;

class ProjectEuler2EvenFibonacciSum {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            
            BigDecimal n=new BigDecimal(br.readLine());
            BigDecimal a = new BigDecimal(1);
            BigDecimal b = new BigDecimal(2);
            BigDecimal sum = new BigDecimal(0);
            BigDecimal sumEven = new BigDecimal(2);
            BigDecimal zero = new BigDecimal(0);
            
            while(sum.compareTo(n) <= 0){
                sum = a.add(b);
                if((sum.remainder(new BigDecimal(2))).compareTo(zero) == 0 && sum.compareTo(n) <= 0) 
                    sumEven = sumEven.add(sum);
                a=b;
                b=sum;               
            }            
            pw.println(sumEven);
        }
        
        pw.close();
    }
}
