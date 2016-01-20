package ImportantProblems;

import java.io.*;
import java.math.BigDecimal;
import java.util.StringTokenizer;

class TestModuloPower {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        int n, l, r, k;
        //int a[];

        //long fact[]=new long[100000001];
        //fact[0]=1;
        long MOD = 1000003;
        int i = 1;
        /* while( i<=1000000000)
         {
         fact[i]=(fact[i-1]*i)%MOD;
         // System.out.println(fact[i]);
         i++;
         }*/
        while (t-- > 0) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            n = Integer.parseInt(st.nextToken());
            l = Integer.parseInt(st.nextToken());
            r = Integer.parseInt(st.nextToken());
            //System.out.println(n+" "+l+" "+ r);
            k = (r - l + 1);
            //System.out.println(k);
            int j;
            long sum = 0;
            long ans;
            if (n == 1) {
                sum = 0;
            } else {
                for (j = 2; j <= n; j++) {
                    long numerator = fact(k + j - 1);
                    long deno = (fact(j) * fact(k - 1)) % MOD;
                    long denoin = modinverse(deno, MOD);
                    ans = (numerator * denoin) % MOD;
                    sum = (sum + ans) % MOD;
                }
            }
            System.out.println((sum + k) % MOD);

        }
    }

    public static long fastPower(long a, long b) {
        long res = 1;
        long mod=1000000007;
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

    public static long fact(long a) {
        long f = 1;
        long i;
        for (i = 2; i <= a; i++) {
            f = (f * i) % (1000003);
        }
        return f;
    }

    public static long fastpower(long a, long b, long M) {
        long MOD = M;
        long x = 1;
        long y = a;
        while (b > 0) {

            if (b % 2 == 1) {
                x = x * y;
                if (x > MOD) {
                    x = x % MOD;
                }
            }
            y = y * y;
            if (y > MOD) {
                y = y % MOD;
            }
            b = b / 2;
        }
        return x;

    }

    public static long modinverse(long a, long m) {
        long x = fastpower(a, m - 2, m);
        return x;
    }
}
