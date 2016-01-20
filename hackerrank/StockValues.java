//not solved
package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class StockValues {

    static int maxSum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            maxSum=0;
            int n = Integer.parseInt(br.readLine());
            int p[] = new int[n + 1];
            String s[] = br.readLine().split(" ");
            for (int i = 1; i <= n; i++) {
                p[i] = Integer.parseInt(s[i - 1]);
            }
            int tempSum = 0, tempP = 0, tempPSum = 0;
            int tempiP = 0, tempiPSum = 0;
            int tempBoth = 0, tempBothSum = 0;
            for (int i = 2; i <= n / 2; i++) {
                tempSum=0;
                tempPSum=0;
                tempiPSum=0;
                tempBothSum=0;
                tempiP = 0;
                tempP = 0;
                tempBoth=0;
                int iP = n - i + 1;
                tempSum = Math.abs(p[i] - p[n - i + 1]);
                tempiP = 0;
                tempP = 0;
                if (p[i - 1] % 2 == 0 && p[i + 1] % 2 == 0) {
                    tempP = (p[i - 1] + p[i + 1]) / 2;
                    tempPSum = Math.abs(tempP - p[n - i + 1]);
                }
                if (p[iP - 1] % 2 == 0 && p[iP + 1] % 2 == 0) {
                    tempiP = (p[iP - 1] + p[iP + 1]) / 2;
                    tempiPSum = Math.abs(tempiP - p[i]);
                }
                if (tempiP != 0 && tempP != 0) {
                    tempBothSum = Math.abs(tempiP - tempP);
                }

                int a = findMax(tempSum, tempPSum, tempiPSum, tempBothSum);
                if (a == 2) {
                    p[i] = tempP;
                } else if (a == 3) {
                    p[iP] = tempiP;
                } else if (a == 4) {
                    p[i] = tempP;
                    p[iP] = tempiP;
                }
            }
            maxSum=maxSum+(Math.abs(p[0]-p[n]));
            pw.println(maxSum);
        }
        pw.close();
    }

    static int findMax(int a, int b, int c, int d) {
        int res = 1;
        int max = 0;
        if (a > b) {
            max = a;
            res = 1;
        } else {
            max = b;
            res = 2;
        }
        if (c > max) {
            max = c;
            res = 3;
        }
        if (d > max) {
            max = d;
            res = 4;
        }
        maxSum = maxSum + max;
        return res;
    }
}
