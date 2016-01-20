//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class ProjectEuler8LargestProductInSeries {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String s[]=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            String s2=br.readLine();
            int a[]=new int[n];
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s2.charAt(i)+"");
            }
            int max=0;
            for(int i=0;i<n-k+1;i++){                
                int p=1;
                //System.out.println(a[i]);
                for(int j=0;j<k;j++){
                    p=p*a[i+j];
                }
                if(p > max)
                    max=p;
            }
            pw.println(max);
        }
        pw.close();
    }
}
