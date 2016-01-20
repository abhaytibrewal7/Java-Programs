//not done

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class SaveQuantumland {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s[] = br.readLine().split(" ");
            char c[] = new char[n];
            for (int i = 0; i < n; i++) {
                c[i] = s[i].charAt(0);
            }
            int count = 0;
            if (n!=1 && c[0] == '0' && c[1] == '0') {
                c[1] = '1';
                count++;
            }
            for (int i = 1; i < n - 1; i++) {
                if (c[i] == '0' && c[i + 1] == '0') {
                    c[i + 1] = '1';
                    i=i+2;
                    count++;
                }
            }
            
            if(n==1)
                count=0;
            
//            char newC[]=new char[n];
//            
//            for(int i=0;i<n;i++){
//                
//            }
            for(int i=0;i<n;i++)
                System.out.print(c[i]+" ");
            pw.println(count);
        }
        pw.close();
    }
}
