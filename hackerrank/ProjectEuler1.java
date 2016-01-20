//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;

class ProjectEuler1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            n = n - 1;
            int num3 = 0, num5 = 0, num15 = 0, flag1 = 0, flag2 = 0, flag3 = 0;
            for (int i = n; i >= 1; i--) {
                if (flag1 == 0) {
                    if (i % 3 == 0) {
                        num3 = i;
                        flag1 = 1;
                    }
                }
                if (flag2 == 0) {
                    if (i % 5 == 0) {
                        num5 = i;
                        flag2 = 1;
                    }
                }
                if (flag3 == 0) {
                    if (i % 3 == 0 && i % 5 == 0) {
                        num15 = i;
                        flag3 = 1;
                    }
                }
                if (flag1 == 1 && flag2 == 1 && flag3 == 1) {
                    break;
                }
            }
            double terms3 = 0, terms5 = 0, terms15 = 0;
            terms3 = (num3 - 3) / 3 + 1;
            terms5 = (num5 - 5) / 5 + 1;
            terms15 = (num15 - 15) / 15 + 1;
            BigDecimal sum=new BigDecimal(0);
            sum = ((new BigDecimal(terms3)).multiply(new BigDecimal(6).add(new BigDecimal((terms3-1)*3)))).divide(new BigDecimal(2));
            sum = sum.add(((new BigDecimal(terms5)).multiply(new BigDecimal(10).add(new BigDecimal((terms5-1)*5)))).divide(new BigDecimal(2)));
            if (flag3 != 0) {
                sum = sum.subtract(((new BigDecimal(terms15)).multiply(new BigDecimal(30).add(new BigDecimal((terms15-1)*15)))).divide(new BigDecimal(2)));
            }

            pw.println(sum.toString());
        }
        pw.close();
    }
}
