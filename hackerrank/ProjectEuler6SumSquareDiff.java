//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;

class ProjectEuler6SumSquareDiff {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        
        BigDecimal one = new BigDecimal(1);
        BigDecimal two = new BigDecimal(2);
        while (t-- > 0) {
            BigDecimal n = new BigDecimal(br.readLine());
            
            BigDecimal squareSum = new BigDecimal(0);
            BigDecimal sumSquare = new BigDecimal(0);
            squareSum = (n.multiply(n.add(one)).multiply((two.multiply(n)).add(one))).divide(new BigDecimal(6));
            sumSquare = ((n.multiply(n.add(one))).divide(two)).pow(2);
            
            pw.println(sumSquare.subtract(squareSum));
        }
        pw.close();
    }
}
