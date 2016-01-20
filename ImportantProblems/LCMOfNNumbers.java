package ImportantProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class LCMOfNNumbers {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
                a[i]=i;
            
            int res=1;
            
            for(int i=2;i<=n;i++){
                res = (res*i)/(gcd(res,i));
            }
            
            pw.println(res);
        }
        pw.close();
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}
