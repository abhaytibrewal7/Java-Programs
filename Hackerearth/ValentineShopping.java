package Hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class ValentineShopping {
    public static void main(String args[])throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int t=Integer.parseInt(br.readLine());
        
        while(t--> 0){
            String s[]=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            
            for(int i=0;i<n;i++){
                int min=Integer.MAX_VALUE;
                int index=0;
                for(int j=0;j<m;j++){
                    String s1[]=br.readLine().split(" ");
                    int d1=Integer.parseInt(s1[0]);
                    int d2=Integer.parseInt(s1[1]);
                    int d3=Integer.parseInt(s1[2]);
                    
                    
                    int discount=(100-d1)*(100-d2)*(100-d3);
                    if(discount < min){
                        min=discount;
                        index=j+1;
                    }
                }
                pw.print(index+" ");
            }
            pw.println();
        }
        
        pw.close();
    }
}
