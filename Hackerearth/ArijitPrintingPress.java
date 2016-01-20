///nahi hua


package Hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class ArijitPrintingPress {
    public static void main(String[] args)throws IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int t=Integer.parseInt(br.readLine());
        
        while(t-->0){
            
            StringBuilder s=new StringBuilder(br.readLine());
            String l=br.readLine();
            int a[]=new int[l.length()];
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                for(int j=0;j<l.length();j++){
                    
                    if(l.charAt(j) < c && a[j]!=1){
                        s.setCharAt(i, l.charAt(j));
                        a[j]=1;
                        break;
                    }
                }
            }
            pw.println(s);
        }
        pw.close();        
    }
}
