//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;

class EmmasNotebook {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        double c=1;
        double one=1;
        for(int i=2;i<=t;i++){
            if(i%2==0)
                one = one+1;            
            c=c+one;
        }
        BigDecimal bd = new BigDecimal(c);
        pw.println(bd);
        pw.close();
    }
}
