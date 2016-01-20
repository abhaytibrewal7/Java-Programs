//not done... fast power me kch problems


package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;

class HelpingAnts {

    static final int mod = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        //System.out.println(mod);
        int n = Integer.parseInt(br.readLine());
        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());
            long wa = fp(2, a - 1);
            long wj = (6 * fp(3, a - 2) + (3 * (fp(3, a - 3) - 1) * fp(2, mod - 2)) + 1) % mod;
            System.out.println(wj);
            long w = (wj - wa) % mod;
            if (a == 2) {
                pw.println(4);
            } else {
                pw.println((long) (w));
            }
        }

        pw.close();
    }

    public static long fp(long a, long b) {
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

    static long fp1(int a, int b) {
        if (b == 0) {
            return 1;
        }
        long temp = fp1(a, b / 2);
        if (b % 2 != 0) {
            return ((a * temp) % mod) * temp % mod;
        } else {
            return (temp * temp) % mod;
        }
    }
}
