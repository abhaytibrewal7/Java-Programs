//solved
package hackerrank;

import java.io.*;
import java.util.*;
import java.math.*;

class ProjectEuler67MaximumSumPath {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            double a[][] = new double[n][n];
            double sum[][] = new double[n][n];

            for (int i = 0; i < n; i++) {
                String s[] = br.readLine().split(" ");
                for (int j = 0; j <= i; j++) {
                    a[i][j] = Double.parseDouble(s[j]);
                }
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    if (i == 0) {
                        sum[i][j] = a[i][j];
                    }
                    if (i != 0) {
                        if (sum[i][j] < a[i][j] + sum[i - 1][j]) {
                            sum[i][j] = a[i][j] + sum[i - 1][j];
                        }
                        if (j + 1 < n && sum[i][j + 1] < a[i][j + 1] + sum[i - 1][j]) {
                            sum[i][j + 1] = a[i][j + 1] + sum[i - 1][j];
                        }
                    }
                }
            }
            double max = 0;
            for (int i = 0; i < n; i++) {
                if (sum[n - 1][i] > max) {
                    max = sum[n - 1][i];
                }
            }
            pw.println((long) max);
        }
        pw.close();
    }
}
