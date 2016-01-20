//solved

package hackerrank;

import java.io.*;
import java.util.*;
import java.math.*;

class ProjectEuler15LatticePaths {

    static final long mod = 1000000007;
    static long fact[] = new long[1001];

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        fact();
        while (t-- > 0) {
            String s[] = br.readLine().split(" ");
            int n = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);

            long numerator = fact[n + m];
            long denom = ((new BigDecimal(fact[n]).multiply(new BigDecimal(fact[m]))).remainder(new BigDecimal(mod))).longValue();

            //long res1 = (int)(numerator/denom);
            long denomInver = fastPower(denom, mod - 2);
            long result = ((new BigDecimal(numerator).multiply(new BigDecimal(denomInver))).remainder(new BigDecimal(mod))).longValue();
            //System.out.println(numerator+" "+denom+" "+denomInver);
            pw.println(result);

        }
        pw.close();

    }

    public static void fact() {
        fact[1] = 1;
        for (int i = 2; i <= 1000; i++) {
            fact[i] = ((new BigDecimal(fact[i - 1]).multiply(new BigDecimal(i))).remainder(new BigDecimal(mod))).longValue();
        }
    }

    public static long fastPower(long a, long b) {
        long res = 1;
        while (b > 0) {
            //System.out.println(b+"....");
            if (b % 2 != 0) {
                res = ((new BigDecimal(res).multiply(new BigDecimal(a))).remainder(new BigDecimal(mod))).longValue();
            }
            a = ((new BigDecimal(a).multiply(new BigDecimal(a))).remainder(new BigDecimal(mod))).longValue();
            b = b / 2;
        }
        return res;
    }

}
