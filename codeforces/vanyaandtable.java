package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class vanyaandtable {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        int x1[]=new int[n];
        int y1[]=new int[n];
        int x2[]=new int[n];
        int y2[]=new int[n];
        int i=0;
        int d=0;
        while(n-->0){
            
            String s[]=br.readLine().split(" ");
            
            x1[i]=Integer.parseInt(s[0]);
            y1[i]=Integer.parseInt(s[1]);
            x2[i]=Integer.parseInt(s[2]);
            y2[i]=Integer.parseInt(s[3]);
     
            for(int j=x1[i];j<=x2[i];j++){
                for(int k=y1[i];k<=y2[i];k++){
                    d++;
                }
            }
                            
            i++;                        
        }
        System.out.println(d);
    }
}