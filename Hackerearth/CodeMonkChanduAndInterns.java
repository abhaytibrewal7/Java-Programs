//solved

package Hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class CodeMonkChanduAndInterns {
    static boolean isPrime[];
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        sieveIsPrime();
        int n=Integer.parseInt(br.readLine());
        int x[]=new int[n];
        for(int i=0;i<n;i++){
            x[i]=Integer.parseInt(br.readLine());
            int sq=(int)Math.sqrt(x[i]);
            if(isPrime[x[i]])
                pw.println("NO");
            else if(sq*sq == x[i] && isPrime[sq])
                pw.println("NO");
            else
                pw.println("YES");
        }        
        pw.close();
    }
    
    static void sieveIsPrime(){
        isPrime=new boolean[10000007];
        Arrays.fill(isPrime, true);
        
        isPrime[0]=false;
        isPrime[1]=true;
        
        for(int i=2;i*i<=10000000;i++){
            if(isPrime[i]){
                for(int j=i*i;j<=10000000;j+=i)
                    isPrime[j]=false;
            }
        }
    }
}
