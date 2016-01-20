//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class AngryProfessor {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String s[]=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            int c=0;
            String s1[]=br.readLine().split(" ");
            int i=0;
            while(i<n){
                int x=Integer.parseInt(s1[i]);
                if(x <= 0)
                    c++;
                if(c>=k)
                    break;
                i++;
            }
            if(c < k)
                pw.println("YES");
            else
                pw.println("NO");
        }        
        pw.close();
    }
}
