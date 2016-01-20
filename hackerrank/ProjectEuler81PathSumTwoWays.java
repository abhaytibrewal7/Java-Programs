//solved
package hackerrank;

import java.io.*;
import java.util.*;
import java.math.*;

class ProjectEuler81PathSumTwoWays {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        double a[][] = new double[n][n];
        double sum[][] = new double[n][n];
        int visited[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            String s[] = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                a[i][j] = Double.parseDouble(s[j]);
            }
        }
        sum[0][0] = a[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j > 0) {
                    if (visited[i][j] == 0) {
                        sum[i][j] = a[i][j] + sum[i][j - 1];
                        visited[i][j] = 1;
                    } else if (sum[i][j] > a[i][j] + sum[i][j - 1]) {
                        sum[i][j] = a[i][j] + sum[i][j - 1];
                    }
                }
                if (i > 0) {
                    if (visited[i][j] == 0) {
                        sum[i][j] = a[i][j] + sum[i - 1][j];
                        visited[i][j] = 1;
                    } else if (sum[i][j] > a[i][j] + sum[i - 1][j]) {
                        sum[i][j] = a[i][j] + sum[i - 1][j];
                    }

                }
            }
        }

        pw.println((long) sum[n - 1][n - 1]);

        pw.close();
    }
}
