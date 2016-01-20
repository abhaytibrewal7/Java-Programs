//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;

class ProjectEuler3LargestPrimeFactor {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            BigDecimal n = new BigDecimal(br.readLine());
            BigDecimal i = new BigDecimal(1);
            BigDecimal otherFactor,factor,max = new BigDecimal(0);
            for(;(i.multiply(i)).compareTo(n) <= 0;i=i.add(new BigDecimal(1))){
                if((n.remainder(i)).compareTo(new BigDecimal(0)) == 0){
                    factor = i;
                    otherFactor  = n.divide(i);
                    
                    if(isPrime(otherFactor)){
                        max = otherFactor;
                        break;
                    }
                    else if(isPrime(factor))
                        max = factor;
                }
            }
            pw.println(max);
        }
        pw.close();
    }

    public static boolean isPrime(BigDecimal a) {
        if (a.compareTo(new BigDecimal(1)) == 0) {
            return false;
        }
        if (a.compareTo(new BigDecimal(3)) <= 0 && (a.compareTo(new BigDecimal(1))) > 0) {
            return true;
        } else if ((a.remainder(new BigDecimal(2))).compareTo(new BigDecimal(0)) == 0 || (a.remainder(new BigDecimal(3))).compareTo(new BigDecimal(0)) == 0) {
            return false;
        } else {
            BigDecimal i;
            for (i = new BigDecimal(5); (i.multiply(i)).compareTo(a) <= 0; i = i.add(new BigDecimal(6))) {
                if ((a.remainder(i)).compareTo(new BigDecimal(0)) == 0 || (a.remainder(i.add(new BigDecimal(2)))).compareTo(new BigDecimal(0)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
