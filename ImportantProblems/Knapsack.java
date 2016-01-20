package ImportantProblems;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Knapsack {
    public static void main(String args[]) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int arr[]={2,3,4,5};
        int val[]={3,4,5,6};
        
        int W=5;
        
        System.out.println(knapsolve(arr,val,W));
    }    
    static int knapsolve(int a[],int b[],int w){
        int dp[][]=new int[a.length+1][w+1];
        
        for(int i=0;i<=a.length;i++){
            dp[i][0]=0;
        }
        
        for(int i=0;i<=w;i++){
            dp[0][i]=0;
        }
        
        
            for(int i=1;i<=a.length;i++)
            {                
                 for(int j=1;j<=w;j++)
                 {
                       if( a[i-1] <= j ){
                           dp[i][j]=Math.max((b[i-1]+dp[i-1][j-a[i-1]]),dp[i-1][j]);
                           
                       }
                       else
                        dp[i][j]=dp[i-1][j];
                 }
        }
            
            for(int i=0;i<=a.length;i++)
            {
                for(int j=0;j<=w;j++)
                {
                    System.out.print(dp[i][j]+" ");
                }
                System.out.println();
                }
            
            return dp[a.length][w];
    }}
