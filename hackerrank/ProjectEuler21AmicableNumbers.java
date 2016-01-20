//solved
package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;

class ProjectEuler21AmicableNumbers {

    static BigDecimal divSum[] = new BigDecimal[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        divisorSum();
        while (t-- > 0) {
            BigDecimal sum = new BigDecimal(0);
            int n = Integer.parseInt(br.readLine());
            for (int i = 2; i <= n; i++) {
                BigDecimal a = divSum[i];
                if (a.compareTo(new BigDecimal(100000)) <= 0) {
                    BigDecimal b = divSum[a.intValue()];
                    if (b.intValue() == i && a.intValue() != i) {                        
                        sum = sum.add(new BigDecimal(i));
                    }
                }
            }
            pw.println(sum);
        }
        pw.close();
    }

    static void divisorSum() {
        divSum[1] = new BigDecimal(1);
        for (int i = 2; i <= 100000; i++) {
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

//
//import java.io.*;
//
//public class AmicableNumbers {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter pw = new PrintWriter(System.out);
//        int t = Integer.parseInt(br.readLine());
//        while (t-- > 0) {
//            int input = Integer.parseInt(br.readLine());
//            long result = sumOfAllAmicableNumbersUptoGivenNumber(input);
//            System.out.println(result);
//        }
//        pw.close();
//    }
//
//    private static long sumOfAllAmicableNumbersUptoGivenNumber(int input) {
//        long sum = 0, factorsSum = 0, sumOfFactors = 0;
//        for (long j = 2; j < input; j++) {
//            factorsSum = getFactorsSum(j);
//            if (j != factorsSum) {
//                sumOfFactors = getFactorsSum(factorsSum);
//                if (j == sumOfFactors) {
//                    sum += j;
//                }
//            } else {
//                continue;
//            }
//        }
//        return sum;
//    }
//
//    private static long getFactorsSum(long j) {
//        long sum = 1;
//        for (int k = 2; k <= Math.sqrt(j); k++) {
//            if (j % k == 0) {
//                sum += k + j / k;
//            }
//        }
//        return sum;
//    }
//}
