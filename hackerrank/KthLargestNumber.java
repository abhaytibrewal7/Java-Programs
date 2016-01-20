package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class KthLargestNumber {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        String s[]=br.readLine().split(" ");
        int n=Integer.parseInt(s[0]);
        int q=Integer.parseInt(s[1]);
        
        String s2[]=br.readLine().split(" ");
        int a[]=new int[n+1];
        for(int i=1;i<=n;i++)
            a[i]=Integer.parseInt(s2[i-1]);
        
        while(q-->0){
            
            String s1[]=br.readLine().split(" ");
            int l=Integer.parseInt(s1[0]);
            int k=Integer.parseInt(s1[1]);
            
            int i=1,j=1;
            while(i<=k){
                if(a[j] >= l)
                    i++;
                j++;
            }
            
            pw.println(a[j-1]);
                        
        }
        pw.close();
    }
}
