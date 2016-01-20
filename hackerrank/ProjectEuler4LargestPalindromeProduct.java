//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class ProjectEuler4LargestPalindromeProduct {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());

        int min = 101101;
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int x = 999, y = 999;
            int p = 1;
            int max = 0;
            while (y >= 100) {
                x = 999;
                while (x >= 100) {
                    p = x * y;
                    if (p <= n && p >= min) {
                        if (isPalin((p + "")) == true) {
                            if (p > max) {
                                max = p;
                                break;
                            }
                        }
                    }
                    if (p < max) {
                        break;
                    }
                    x--;
                }
                y--;
            }
            pw.println(max);
        }

        pw.close();

    }

    public static boolean isPalin(String s) {
        StringBuffer rev = new StringBuffer(s);
        StringBuffer rever = new StringBuffer(rev);
        rever.reverse();
        if ((rev.toString()).compareTo(rever.toString()) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
