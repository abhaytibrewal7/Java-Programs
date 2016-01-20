//solved

package hackerrank;

import java.io.*;
import java.math.*;

class ProjectEuler20FactorialDigitSum {

    static BigDecimal fact[] = new BigDecimal[1001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());

        factorial();
        while (t-- > 0) {
            int a = Integer.parseInt(br.readLine());
            BigDecimal n = fact[a];
            
            String s=n.toString();
            double sum=0;
            for(int i=0;i<s.length();i++){
                sum = sum+(Integer.parseInt(s.charAt(i)+""));
            }
            pw.println((long)sum);
        }
        pw.close();
    }

    static void factorial() {
        BigDecimal one = new BigDecimal(1);
        fact[1] = one;
        fact[0]=one;
        for (int i = 2; i <= 1000; i++) {
            fact[i] = fact[i - 1].multiply(new BigDecimal(i));
        }
    }
}
