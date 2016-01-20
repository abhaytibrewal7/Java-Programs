package ImportantProblems;


import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerandBigDecimalUsage {

    public static void main(String[] args) {
        calculateFactorial(50);
    }
    public static void calculateFactorial(int n) {
        
        BigInteger result = BigInteger.ONE;
        long t=0;
        
        for (int i=1; i<=n; i++) {
            BigDecimal bt=new BigDecimal(i);
            BigInteger bb=new BigInteger("123");
            BigInteger bbb=BigInteger.valueOf(10);
            BigInteger bbbb=new BigInteger(String.valueOf(10));
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(n + "! = " + result);
    }
    
}    

