//not solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class StockValues2 {

    static int maxSum = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            maxSum = 0;
            int n = Integer.parseInt(br.readLine());
            int p[] = new int[n + 1];
            String s[] = br.readLine().split(" ");
            for (int i = 1; i <= n; i++) {
                p[i] = Integer.parseInt(s[i - 1]);
            }

            int tempP[] = new int[n + 1];
            int tempiP[] = new int[n + 1];
            int tempBoth[] = new int[n + 1];
            tempP[1] = tempiP[1] = tempBoth[1] = p[1];
            tempP[n] = tempiP[n] = tempBoth[n] = p[n];
            for (int i = 2; i <= n / 2; i++) {
                int iP = n - i + 1;
                if (p[i - 1] % 2 == 0 && p[i + 1] % 2 == 0) {
                    tempP[i] = (p[i - 1] + p[i + 1]) / 2;
                    tempP[iP] = p[iP];
                }
                if (p[iP - 1] % 2 == 0 && p[iP + 1] % 2 == 0) {
                    tempiP[iP] = (p[iP - 1] + p[iP + 1]) / 2;
                    tempiP[i] = p[i];
                }
                if (tempiP[iP] != 0 && tempP[i] != 0) {
                    tempBoth[i] = tempP[i];
                    tempBoth[iP] = tempiP[iP];
                }

                int a = findMaxSum(p, tempP, tempiP, tempBoth);
                if (a == 2) {
                    p[i] = tempP[i];
                    p[iP] = tempP[iP];
                    tempiP[i] = tempP[i];
                    tempiP[iP] = tempP[iP];
                    tempBoth[i] = tempP[i];
                    tempBoth[iP] = tempP[iP];
                } else if (a == 3) {
                    p[i] = tempiP[i];
                    p[iP] = tempiP[iP];
                    tempP[i] = tempiP[i];
                    tempP[iP] = tempiP[iP];
                    tempBoth[i] = tempiP[i];
                    tempBoth[iP] = tempiP[iP];
                } else if (a == 4) {
                    p[i] = tempP[i];
                    p[iP] = tempiP[iP];
                    tempiP[i] = tempP[i];
                    tempP[iP] = tempiP[iP];
                    tempBoth[i] = tempP[i];
                    tempBoth[iP] = tempiP[iP];
                } else {
                    tempP[i] = p[i];
                    tempP[iP]=p[iP];
                    tempiP[iP] = p[iP];
                    tempiP[i]=p[i];
                    tempBoth[i] = p[i];
                    tempBoth[iP] = p[iP];
                }
            }
            pw.println(maxSum);
        }
        pw.close();
    }

    static int findMaxSum(int a[], int b[], int c[], int d[]) {
        int res = 1;
        int max = 0;
        int sum1 = findSum(a);
        int sum2 = findSum(b);
        int sum3 = findSum(c);
        int sum4 = findSum(d);

        if (sum1 > sum2) {
            max = sum1;
            res = 1;
        } else {
            max = sum2;
            res = 2;
        }
        if (sum3 > max) {
            max = sum3;
            res = 3;
        }
        if (sum4 > max) {
            max = sum4;
            res = 4;
        }
        display(a);
        display(b);
        display(c);
        display(d);
        System.out.println(res + " " + max);
        maxSum = max;
        return res;
    }

    static int findSum(int a[]) {
        int sum = 0;
        for (int i = 1; i <= (a.length - 1) / 2; i++) {
            sum = sum + (Math.abs(a[i] - a[a.length - 1 - i + 1]));
        }
        return sum;
    }

    static void display(int a[]) {
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i] + "  ");
        }
        System.out.println();
    }
}
