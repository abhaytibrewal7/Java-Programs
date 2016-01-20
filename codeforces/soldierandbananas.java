package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class soldierandbananas {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String s[]=br.readLine().split(" ");
        int k=Integer.parseInt(s[0]);
        int n=Integer.parseInt(s[1]);
        int w=Integer.parseInt(s[2]);
        int sum=0;
        for(int i=1;i<=w;i++){
            sum=sum+(k*i);
        }
        if(sum > n){
            System.out.println(sum-n);
        }
        else
            System.out.println(0);
        
    }
}
