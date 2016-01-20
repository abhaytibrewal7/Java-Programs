//not solved

package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Spheres {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        String s[]=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int m=Integer.parseInt(s[1]);
        int c=Integer.parseInt(s[2]);
        double seqSum[]=new double[c+1];
        int upper[]=new int[n+1];
        int lower[]=new int[m+1];
        long matched[]=new long[c+1];
        
        String u[]=br.readLine().split(" ");
        String l[]=br.readLine().split(" ");
        
        for(int i=0;i<n;i++)
            upper[Integer.parseInt(u[i])]++;
        for(int i=0;i<m;i++)
            lower[Integer.parseInt(l[i])]++;
        
        for(int i=1;i<=c;i++){
            matched[i]=upper[i]*lower[i];                                    
        }
        
        int k=1;
        double sum=0;
        while(k!=c){
            sum=0;          
            for(int i=1;i<=c;i++){
                long ai=1;
                int jAi;
                for(jAi=i;jAi<=k+i-1 && jAi<=c;jAi++){
                    ai = (long)(ai * matched[jAi]);
                }
                for(int j=i+k;j<=c;j++){
                    sum = sum + (ai * matched[j]);
                }
            }
            seqSum[k++]=sum;
        }
        for(int i=1;i<=c;i++)
            pw.print((long)seqSum[i]+" ");
        pw.close();
    }
}
