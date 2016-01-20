package hackerrank;

import java.io.*;
import java.util.*;
import java.math.*;

class ProjectEuler16PowerDigitSum {

    static final long mod = 1000000007;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            BigInteger res = new BigInteger(String.valueOf(fastPower(2, n)));

            //System.out.println(res); 
            long sum = 0;
            while ((res.compareTo(BigInteger.ZERO)) > 0) {
                //System.out.println(res);
                sum = sum + (res.remainder(new BigInteger(String.valueOf(10)))).longValue();
                res = res.divide(new BigInteger(String.valueOf(10)));

            }
            pw.println(sum);
        }
        pw.close();
    }

    public static BigDecimal fastPower(long a, int b) {
        BigDecimal res = new BigDecimal(1);
        BigDecimal aBig = new BigDecimal(a);
        while (b > 0) {
            //  System.out.println(b+"..");
            if (b % 2 != 0) {
                res = res.multiply(aBig);
            }
            aBig = aBig.multiply(aBig);
            b = b / 2;
        }
        return res;
    }

}
