//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigDecimal;

class ProjectEuler11LargestProductInGrid {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        int a[][]=new int[20][20];
        for(int i=0;i<20;i++){
            String s[]=br.readLine().split(" ");
            for(int j=0;j<20;j++){
                a[i][j]=Integer.parseInt(s[j]);
            }
        }
        
        double max=0,p=1;
        
        for(int i=0;i<20;i++){
            p=1;
            for(int j=0;j<20;j++){
                if(j+3 <20){    //right
                    p=a[i][j]*a[i][j+1]*a[i][j+2]*a[i][j+3];
                    if(p> max)
                        max=p;
                }
                
                if(i+3 <20){  //down
                    p =a[i][j]*a[i+1][j]*a[i+2][j]*a[i+3][j];
                    if(p>max)
                        max=p;
                }
                
                if(i+3 < 20 && j+3 <20 ){  //right diagnol
                    p=a[i][j]*a[i+1][j+1]*a[i+2][j+2]*a[i+3][j+3];
                    if(p>max)
                        max=p;
                }             
                
                if(i+3 < 20 && j-3 >=0 ){  //left diagnol
                    p=a[i][j]*a[i+1][j-1]*a[i+2][j-2]*a[i+3][j-3];
                    if(p>max)
                        max=p;
                }
            }
        }
        
        pw.println(new BigDecimal(max));
        pw.close();
    }
}
