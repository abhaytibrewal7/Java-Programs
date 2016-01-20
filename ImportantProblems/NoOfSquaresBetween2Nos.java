//find no. of square nos between 2  nos. (a and b) (both inclusive).. hackerrank. Sherlock and Squares
// do ceil of square root of a and floor of sqrt root of b.. no then subtract them and add 1.. 
//this will give nos. of squares between [a,b]

package ImportantProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class NoOfSquaresBetween2Nos {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = 0;
            int xA = (int) (Math.ceil(Math.sqrt(a)));
            int xB = (int) Math.sqrt(b);
            pw.println(xB - xA + 1);
        }
        pw.close();
    }
}

