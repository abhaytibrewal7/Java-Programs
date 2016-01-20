package ImportantProblems;

import java.math.BigDecimal;
import java.util.Arrays;

public class SieveOfErosPrime {

    static boolean isPrime[];

    public static void main(String[] args) {

    }
    
    
    static BigDecimal sum[]=new BigDecimal[1000007];
    public static void sieveforBigNumbers(){
        boolean isPrime[]=new boolean[1000007];
        for(int i=2;i<1000007;i++)
            isPrime[i]=true;       
        sum[0]=BigDecimal.ZERO;
        sum[1]=BigDecimal.ZERO;
        BigDecimal big  = new BigDecimal(1000007);
        for(int i=2;i<1000007;i++){
            sum[i]=sum[i-1];
            if(isPrime[i]){
                sum[i] = sum[i-1].add(new BigDecimal(i));
                BigDecimal k = new BigDecimal(i);
                k = k.multiply(k);
                for(BigDecimal j=k;big.compareTo(j) > 0;){                                    
                    isPrime[j.intValue()]=false;
                    j=new BigDecimal(j.intValue()+i);
                }
            }
        }
    }

    static void sieveIsPrime() {
        isPrime = new boolean[10000007];
        Arrays.fill(isPrime, true);

        isPrime[0] = false;
        isPrime[1] = true;

        for (int i = 2; i * i <= 10000000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 10000000; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }    
    
    public static boolean isPrime(BigDecimal a) {
        if (a.compareTo(new BigDecimal(1)) == 0) {
            return false;
        }
        if (a.compareTo(new BigDecimal(3)) <= 0 && (a.compareTo(new BigDecimal(1))) > 0) {
            return true;
        } else if ((a.remainder(new BigDecimal(2))).compareTo(new BigDecimal(0)) == 0 || (a.remainder(new BigDecimal(3))).compareTo(new BigDecimal(0)) == 0) {
            return false;
        } else {
            BigDecimal i;
            for (i = new BigDecimal(5); (i.multiply(i)).compareTo(a) <= 0; i = i.add(new BigDecimal(6))) {
                if ((a.remainder(i)).compareTo(new BigDecimal(0)) == 0 || (a.remainder(i.add(new BigDecimal(2)))).compareTo(new BigDecimal(0)) == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}
