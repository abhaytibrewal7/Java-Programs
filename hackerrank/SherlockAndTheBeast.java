//not solved.. seen solntions.. below code wrong.. find pattern for 3.. ((2*n)%3)*5
package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class SherlockAndTheBeast {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int m = n;
            int x5 = 0, x3 = 0, flag = 0, rem, z = 0;
            while (true) {
                rem = m % 3;
                if (rem == 0 && (n - m) % 5 == 0) {
                    x5 = m;
                    x3 = n - m;
                    break;

                } else {
                    x5 = m - rem;
                    if ((n - (m - rem)) % 5 == 0) {
                        x3 = n - (m - rem);
                    } else if (m - 5 >= 0) {
                        m = m - 5;
                        z = z + 5;
                    } else {
                        break;
                    }
                }
                //System.out.println(m + " " + z + " " + x5 + " " + x3);
            }
            String res = "";
            if(x5==0 && x3==0)
                pw.println("-1");
            else if (x5 % 3 == 0 && x3 % 5 == 0) {
                while (x5 != 0) {
                    res = res + "5";
                    x5--;
                }
                while (x3 != 0) {
                    res = res + "3";
                    x3--;
                }
                pw.println(res);
            } else {
                pw.println("-1");
            }
        }

        pw.close();
    }
}
