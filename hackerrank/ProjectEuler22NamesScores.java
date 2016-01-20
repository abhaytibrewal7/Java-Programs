//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class ProjectEuler22NamesScores {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int n = Integer.parseInt(br.readLine());
        String s[] = new String[n];
        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }

        Arrays.sort(s);
        int q = Integer.parseInt(br.readLine());
        while (q-- > 0) {
            String v = br.readLine();
            long x = compute(v);
            int index = Arrays.binarySearch(s, v);
            pw.println(index * x);
        }
        pw.close();
    }

    static long compute(String s) {
        long sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum = sum + (int) (s.charAt(i) - 'A' + 1);
        }
        return sum;
    }
}
