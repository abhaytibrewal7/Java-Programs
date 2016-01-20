//solved

package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class WhoDaresToBeMillionaire {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            char ques[] = br.readLine().toCharArray();
            char ans[] = br.readLine().toCharArray();
            String s[] = br.readLine().split(" ");
            long w[] = new long[n + 1];

            for (int i = 0; i <= n; i++) {
                w[i] = Long.parseLong(s[i]);
            }
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (ques[i] == ans[i]) {
                    k++;
                }
            }
            long max = -1;
            for (int i = 0; i <= k ; i++) {
                if (w[i] > max) {
                    max = w[i];
                }
            }
            if(k==n)
                pw.println(w[n]);
            else
                pw.println(max);
        }
        pw.close();
    }
}
