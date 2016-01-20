package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.math.BigInteger;

public class vanyanadbooks {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String s=br.readLine();
        double n=Double.parseDouble(s);
        
        int l=s.length();
        double num_nine;
        double sum=0;
        int i;
        for(i=l;i>2;i--){
            num_nine=(int)(Math.pow(10,i-1)-1);
            sum=sum+ ((n-num_nine) * i);
            n=num_nine;
        }
        if(i==2){
            sum=sum+((n-9)*2) + 9;
            
        }        
        if(l==1){
            sum=sum+n;
        }
        BigDecimal bigd=new BigDecimal(sum);
        pw.println(bigd+"");
        BigDecimal bigd2=new BigDecimal(10.3);
        pw.println(bigd2+"");
        pw.close();
    }
}

