//not solved
package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ghoraAndTable {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        String s[]=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        int a[][]=new int[n+1][m+1];
        for(int i=1;i<=n;i++){
            String s1[]=br.readLine().split(" ");
            for(int j=1;j<=m;j++){
                a[i][j]=Integer.parseInt(s1[j-1]);
            }
        }
        int count=0;
        for(int i=1;i<=n;i++){
            if(a[i][1]==1 || a[i][n]==1){                            
                count=2;
                break;
            }
        }
        
        for(int i=1;i<=m;i++){
            if(a[1][i]==1 || a[1][n]==1){               
                count=2;            
                break;
            }
        }         
        if(count == 0)
            count =4;
        pw.println(count);
        pw.close();
    }
}
