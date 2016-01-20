//Correct

package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CookingMachine {
    public static void main(String[] args)throws IOException {
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int n=Integer.parseInt((br.readLine()));
        while(n-->0){
            
            String s[]=br.readLine().split(" ");
            int x=Integer.parseInt(s[0]);
            int y=Integer.parseInt(s[1]);
            int c=0;
            while((x & (x-1))!=0){
                x=x>>1;
                c++;
            }
            while(x!=y){
                if(x < y)
                    x=x<<1;
                else if( x > y)
                    x=x>>1;
                c++;
            }
            pw.println(c);
        }
        pw.close();
    }
}
