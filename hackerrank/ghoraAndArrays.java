package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ghoraAndArrays {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        int x[]=new int[n];
        int y[]=new int[n];
        for(int i=0;i<n;i++){
            x[i] = Integer.parseInt(s[i]);
            y[i]=x[i];
        }
        for(int i=0;i<n;i++){
            x[i]=y[y[i]];
        }
        for(int i=0;i<n;i++)
            pw.print(x[i]+" ");
        pw.close();
    }
}
