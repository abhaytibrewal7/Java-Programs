
package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.util.Arrays;

class NoOfFactorsPrimeFactorization {

    static BigDecimal NoOfDivisors[] = new BigDecimal[2001];
    static int visited[] = new int[2001];
    static int Prime[] = new int[50000];
    static boolean isPrime[] = new boolean[50000];
    static int noOfPrime = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        sieve();
        System.out.println(PrimeFactorisationNoOfFactors(7));
        System.out.println(PrimeFactorisationNoOfFactors(8));
        System.out.println(PrimeFactorisationNoOfFactors(10));
        System.out.println(PrimeFactorisationNoOfFactors(100));
        System.out.println(PrimeFactorisationNoOfFactors(1000));
        System.out.println(PrimeFactorisationNoOfFactors(10000));
        System.out.println(PrimeFactorisationNoOfFactors(1001));
        
        
//
//        int t = Integer.parseInt(br.readLine());
//        sieve();
//        NoOfDivisors[1] = new BigDecimal(1);
//        NoOfDivisors[2] = new BigDecimal(3);
//        NoOfDivisors[3] = new BigDecimal(6);
//        NoOfDivisors[4] = new BigDecimal(6);
//        visited[2] = 1;
//        for (int i = 3; i < 50000; i++) {
//
//            int j = PrimeFactorisationNoOfFactors(i);
//            int k = PrimeFactorisationNoOfFactors(i + 1);
//            if (visited[j * k] == 0) {
//                NoOfDivisors[j * k] = (new BigDecimal(i).multiply(new BigDecimal(i + 1))).divide(new BigDecimal(2));
//                visited[j * k] = 1;
//            }
//        }
//        while (t-- > 0) {
//            int n = Integer.parseInt(br.readLine());
//            n = n + 1;
//            int i = n;
//            while (visited[i] != 1) {
//                i++;
//            }
//            pw.println(NoOfDivisors[i]);
//        }
//        pw.close();
    }

    public static void sieve() {

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i < 50000; i++) {
            if (isPrime[i]) {
                Prime[noOfPrime++] = i;
                BigDecimal k = new BigDecimal(i);
                k = k.multiply(k);
                for (BigDecimal j = k; new BigDecimal(50000).compareTo(j) > 0;) {
                    isPrime[j.intValue()] = false;
                    j = new BigDecimal(j.intValue() + i);
                }
            }
        }
    }

    public static int PrimeFactorisationNoOfFactors(int n) {
        int nod = 1;
        int remainder = n;
        int flagfor2 = 0;
        for (int i = 0; i < noOfPrime; i++) {

            if ((new BigDecimal(Prime[i]).multiply(new BigDecimal(Prime[i]))).compareTo(new BigDecimal(n)) > 0) {
                return nod * 2;
            }

            int exponent = 1;

            while (remainder % Prime[i] == 0) {
                exponent++;
                remainder = remainder / Prime[i];
                if (Prime[i] == 2) {
                    flagfor2 = 1;
                }
            }
//            if (flagfor2 == 1) {
//                exponent = exponent - 1;
//                flagfor2 = 0;
//            }
            nod *= exponent;

            if (remainder == 1) {
                return nod;
            }
        }
        return nod;
    }
}
