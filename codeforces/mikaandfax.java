package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class mikaandfax {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String s=br.readLine();
        int n=Integer.parseInt(br.readLine());
        int c=n;
        int len=s.length()/n;
        int i=0;
        int t=0;
        while(c-->0){            
         if(palin(s.substring(i, i+len))){
             t++;                                      
             i=i+len;
         }  
         else
             break;         
        }
        if(s.length()%n==0){
         if(t==n){
              System.out.println("YES");
           }
           else
              System.out.println("NO");
           }
        else
            System.out.println("NO");
    }
    public static boolean palin(String s){
        
        StringBuilder str=new StringBuilder(s);
        String rev=str.reverse().toString();
        if(rev.equals(s)){
            return true;
        }
        else{
            return false;
        }
    }
}
