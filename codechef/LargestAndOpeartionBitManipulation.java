package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;

class LargestAndOpeartionBitManipulation {
    public static void main(String args[])throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int n=Integer.parseInt(br.readLine());
        Integer a[]=new Integer[n];
        int f[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(br.readLine());
        }
        /*
        int ans=0;
        for(int i=30;i>=0;i--){
            
            int c=0;
            for(int j=0;j<n;j++){
                if(((a[j] & (1 << i))!=0) && f[j]==0)
                    c++;                    
                }
            if(c<=1)
                continue;
           ans=ans+(1<<i);
           
           for(int j=0;j<n;j++)
               if(f[j]==0 && (a[j] & (1 << i))==0)
                   f[j]=1;
        }        
        pw.println(ans);
        pw.close();
    }
}
*/
        int max=0;
        Arrays.sort(a,Collections.reverseOrder());
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if((a[i] & a[j])> 0 && (a[i] & a[j]) > max)
                    max=a[i]&a[j];
            }
        }
        pw.println(max);
        pw.close();
    }
}