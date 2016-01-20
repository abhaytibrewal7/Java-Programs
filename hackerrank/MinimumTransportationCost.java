//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class MinimumTransportationCost {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String x = br.readLine();
            int xLength = x.length();
            char xC[] = x.toCharArray();

            String u = br.readLine();
            int uLength = u.length();
            char uC[] = u.toCharArray();

            String s[] = br.readLine().split(" ");
            int a = Integer.parseInt(s[0]);
            int b = Integer.parseInt(s[1]);
            int c = Integer.parseInt(s[2]);

            int cost = 0;            
            int hashX[] = new int[26];
            int hashU[] = new int[26];            
            for (int i = 0; i < xLength; i++) {
                int ascii = xC[i] - 'a';
                hashX[ascii]++;                
            }            
            for (int i = 0; i < uLength; i++) {
                int ascii = uC[i] - 'a';
                hashU[ascii]++;
            }
            int yLess = 0;
            int yExtra=0;
            //int yExtra[] = new int[26], yLess[] = new int[26];
            int totalLess = 0;
            int totalExtra=0;
            for (int i = 0; i < 26; i++) {
                if(hashX[i] < hashU[i]){
                    yLess = hashU[i] - hashX[i];
                    totalLess = totalLess + yLess;
                }
                else{
                    yExtra = hashX[i] - hashU[i];
                    totalExtra = totalExtra + yExtra;
                }
                    
            }
            //System.out.println(totalExtra+" "+totalLess);
            if(a+b < c){
//                if(xLength < uLength){
//                    cost = cost + (uLength - xLength)*b;
//                    totalLess = totalLess - (uLength - xLength);
//                }                
//                else{
//                    cost = cost +(xLength - uLength)*a;
//                    totalExtra = totalExtra - (xLength - uLength);
//                }
                cost = (Math.min(totalLess,totalExtra))*(a+b);
            }
            else{
//                if(xLength < uLength){
//                    cost = cost + (xLength - uLength)*b;                    
//                    totalLess = totalLess - (uLength - xLength);
//                }
//                else{
//                    cost = cost + (xLength - uLength)*a;
//                    totalExtra = totalExtra - (xLength - uLength);
//                }
                cost = (Math.min(totalLess,totalExtra))*c;
            }            
            if(totalExtra > totalLess)
                cost = cost + (totalExtra - totalLess)*a;
            else
                cost = cost + (totalLess - totalExtra)*b;
            pw.println(cost);
        }

        pw.close();
    }
}

