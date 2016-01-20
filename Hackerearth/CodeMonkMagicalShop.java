//solved

package Hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;

public class CodeMonkMagicalShop {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String s[] = br.readLine().split(" ");
        BigInteger ba=new BigInteger(s[0]);
        BigInteger bmod=new BigInteger(s[1]);
//        double a = Double.parseDouble(s[0]);
//        double mod = Double.parseDouble(s[1]);
        char p[] = br.readLine().toCharArray();
        BigInteger sum=BigInteger.ZERO;
        for (int i = 0; i < p.length; i++) {
            if (p[i] == '1') {
                sum=(sum.add(ba)).mod(bmod);
            }
            ba=(ba.multiply(ba)).mod(bmod);
        }
        pw.println(sum.toString());
        pw.close();
    }
}
    
//    static int fastPower(int a,int b,int mod){
//        int ans=1;
//        int k=0;
//        while(b!=0){
//            if(b%2!=0){
//                ans=(ans*a)%mod;                                
//            }
//            a=(a*a)%mod;
//            b=b/2;
//        }
//        return ans;
//    }
//}
