//all test case solved except 1 value.. for n=1

package Hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CodeMonkConfusedMonk {

    static final int mod = 1000000007;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        double x[] = new double[n];
        String s[] = br.readLine().split(" ");
        x[0] = Integer.parseInt(s[0]);
        double fx = x[0];
        double gx = x[0];
        for (int i = 1; i < n; i++) {
            x[i] = Integer.parseInt(s[i]);
            fx = (fx * x[i]) % mod;
            gx = (gcd(gx, x[i])) % mod;
        }
        double ans = fastPower(fx, gx);
        System.out.println(fastPower(170,170));
        pw.println((long) ans);
        pw.close();
    }

    static double gcd(double a, double b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    static double fastPower(double a, double b) {

        double ans = 1;
        while (b != 0) {
            if (b % 2 == 1) {
                ans = (ans * a) % mod;
            }
            a = (a * a) % mod;
            b = b / 2;
        }
        return ans;
    }
}
