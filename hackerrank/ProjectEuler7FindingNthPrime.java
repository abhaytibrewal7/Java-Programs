//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;

class ProjectEuler7FindingNthPrime {

    static int prime[]=new int[10000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());        
        sieve();
        while (t-- > 0) {            
            int n = Integer.parseInt(br.readLine());
            pw.println(prime[n]);            
        }
        pw.close();
    }
    
        public static void sieve(){
        boolean isPrime[]=new boolean[1000007];
        for(int i=2;i<1000007;i++)
            isPrime[i]=true;       
        BigDecimal big  = new BigDecimal(1000007);
        int m=1;
        for(int i=2;i<1000007;i++){
            if(isPrime[i]){
                prime[m++]=i;
                BigDecimal k = new BigDecimal(i);
                k = k.multiply(k);
                for(BigDecimal j=k;big.compareTo(j) > 0;){                                    
                    isPrime[j.intValue()]=false;
                    j=new BigDecimal(j.intValue()+i);
                }
            }
        }
    }
}   
