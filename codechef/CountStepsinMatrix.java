//solved

package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CountStepsinMatrix {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int t=Integer.parseInt(br.readLine());
        
        while(t-->0){
            
            int n=Integer.parseInt(br.readLine());
            int p=(n)*(n)+1;
            
            int a[][]=new int[n+1][n+1];
            Steps[] object=new Steps[p];
            
            for(int i=1;i<=n;i++){
                String s[]=br.readLine().split(" ");
                for(int j=1;j<=n;j++){
                    a[i][j]=Integer.parseInt(s[j-1]);
                    object[(a[i][j])]=new Steps(i,j);
                }
            }
            int steps=0;
            for(int i=2;i<p;i++){
                int k=Math.abs(object[i].i - object[i-1].i);
                int l=Math.abs(object[i].j - object[i-1].j);
                steps+=k+l;
            }
            pw.println(steps);
        }
        pw.close();
    }
}

class Steps{
    
    int i,j;
    Steps(int a,int b){
        i=a;
        j=b;
    }
}
