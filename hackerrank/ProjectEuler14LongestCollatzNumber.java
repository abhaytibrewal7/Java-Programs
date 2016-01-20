//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;

public class ProjectEuler14LongestCollatzNumber {

    public static final int NUM = 5000000;
    public static final int test = 25;
    static double length[] = new double[NUM + 1];
    static int maxLength[] = new int[NUM + 1];
    static boolean visited[] = new boolean[NUM + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        compute();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            pw.println(maxLength[n]);
        }
        pw.close();
    }
    static double max = 1;
    static int maxi = 1;

    static void compute() {
        length[1] = 1;
        maxLength[1] = 1;
        visited[1] = true;
        for (int i = 2; i <= NUM; i++) {
            if (visited[i] == false) {
                visited[i] = true;
                length[i] = find(i);
            }
            if (length[i] >= max) {
                max = length[i];
                maxi = i;
                maxLength[i] = i;
            } else {
                maxLength[i] = maxi;
            }
        }
    }
    static BigDecimal seq = new BigDecimal(0);

    static double find(long a) {

        if (a % 2 == 0) {
            seq = new BigDecimal(a).divide(new BigDecimal(2));
        } else {
            seq = (new BigDecimal(3).multiply(new BigDecimal(a))).add(new BigDecimal(1));
        }
        if (seq.compareTo(new BigDecimal(NUM)) <= 0 && seq.compareTo(new BigDecimal(0)) >= 0 && visited[seq.intValue()] == true) {
            return length[seq.intValue()] + 1;
        }
        if (seq.compareTo(new BigDecimal(NUM)) <= 0 && a <= NUM) {
            visited[(int) a] = true;
            length[(int) a] = find(seq.intValue()) + 1;
            return length[(int) a];
        } else {
            double len = find(seq.longValue()) + 1;
            return len;
        }
    }
}
