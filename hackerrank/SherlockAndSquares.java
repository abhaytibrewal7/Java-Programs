//solved
package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class SherlockAndSquares {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s[]=br.readLine().split(" ");
            int a=Integer.parseInt(s[0]);
            int b=Integer.parseInt(s[1]);
            int c=0;
            int xA=(int)(Math.ceil(Math.sqrt(a)));
            int xB = (int)Math.sqrt(b);                        
            pw.println(xB-xA+1);
        }
        pw.close();
    }
}
