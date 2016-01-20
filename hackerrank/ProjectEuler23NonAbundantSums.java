//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;

class ProjectEuler23NonAbundantSums {

    static BigDecimal divSum[] = new BigDecimal[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        divisorSum();
        long abundant[]=new long[100000];
        boolean isAbundant[]=new boolean[100000];
        int k=0;
        for (int i = 2; i <= 28123; i++) {
            if(divSum[i].longValue() > i)
                abundant[k++]=i;
        }
        for(int i=0;i<=k;i++){
            for(int j=0;j<=k;j++){
                if(abundant[i] + abundant[j] <=28123)
                    isAbundant[(int)(abundant[i]+abundant[j])]=true;
            }
        }
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            if(n >= 28123 || isAbundant[n]==true )
                pw.println("Yes");
            else
                pw.println("No");
        }
    }

    static void divisorSum() {
        divSum[1] = new BigDecimal(1);
        for (int i = 2; i <= 28123; i++) {
            BigDecimal sum = new BigDecimal(0);
            int x = 1, y;
            int sqrt = (int) Math.sqrt(i);
            for (int j = 2; j <= sqrt; j++) {
                if (i % j == 0) {
                    x = j;
                    sum = sum.add(new BigDecimal(x));
                    if (j != (i / x)) {
                        y = i / x;
                        sum = sum.add(new BigDecimal(y));
                    }
                }
            }
            divSum[i] = sum.add(new BigDecimal(1));
        }
    }
}
