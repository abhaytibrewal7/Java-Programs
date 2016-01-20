///nahi hua

package Hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class SplendidMatrices {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int n=Integer.parseInt(br.readLine());
        n=(int)Math.pow(2, n);
        int arr[][]=new int[n][n];
        int k=1;
        compute(arr,n,k);
        
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                pw.print(arr[i][j]+" ");
            }
            pw.println();
        }
        pw.close();
    }
    public static void compute(int arr[][],int n,int k){
        
        int l=0,m=1;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                arr[i][j]=k;
                k++;
                c++;
                
                if(l==3){
                    //System.out.println("bhd");
                    l=0;   
                    c=0;
                    m=1;
                }
                if(c==2 && m==1 && l!=4){
                    k=k+2;
                    c=0;m=2;l++;                    
                }
                if(c==2 && m==2 && l!=4){
                    k=k-4;
                    c=0;
                    m=1;
                    l++;
                }                                
            }
        }
    }
}
