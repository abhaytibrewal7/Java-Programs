package codeforces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class mikeandfun {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        String s[]=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        int q=Integer.parseInt(s[2]);
        int arr[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            String s1[]=br.readLine().split(" ");
            for(int j=1;j<=m;j++){
               arr[i][j]=Integer.parseInt(s1[j-1]);               
            }            
        }
        int c[]=new int[n+1];
         for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                int t=0;
                while(j<=m && arr[i][j]==1){
                    t++;
                    j++;
                }
                    c[i]=Math.max(c[i],t);
                    
            }
        }
        for(int t=0;t<q;t++){
            String s2[]=br.readLine().split(" ");
            int i=Integer.parseInt(s2[0]);
            int j=Integer.parseInt(s2[1]);
            
            if(arr[i][j]==1)
            {
                arr[i][j]=0; 
            }
            else{
                arr[i][j]=1; 
            }
            
            System.out.println(score(arr,n,m,i,c));
        }        
    }
    public static int score(int arr[][],int n,int m,int i,int c[]){
        
      /*for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print(arr[i][j]+" ");
            }            
            System.out.println();
        }
       
       for(int j=1;j<=n;j++)
           System.out.print(c[j]+" ");
       */
       c[i]=0;         
            for(int j=1;j<=m;j++){
                int t=0;
                while(j<=m && arr[i][j]==1){
                    t++;
                    j++;
                }
                    c[i]=Math.max(c[i],t);
                    
            
        }
        int max=0;
        for(int k=1;k<=n;k++){
            if(c[k]> max)
                max=c[k];
        }
        return max;
    }
}
