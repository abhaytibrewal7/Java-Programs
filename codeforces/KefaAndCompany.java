//solved

package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class KefaAndCompany {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int d = Integer.parseInt(s[1]);
        Friends f[] = new Friends[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            String s1[] = br.readLine().split(" ");
            f[i] = new Friends(Integer.parseInt(s1[0]), Integer.parseInt(s1[1]));
            sum = sum + f[i].s;
        }
        Arrays.sort(f);

        double max = 0;        
        int j=1;
        sum=f[0].s;
        for (int i = 0; i < n; i++) {
            if(i!=0)
                sum=sum-f[i-1].s;
            for (; j < n; j++) {
                if (f[j].m - f[i].m < d) {
                    sum = sum + f[j].s;
                } else {
                    break;
                }
            }
            if (sum > max) {
                max = sum;
            }
        }

        pw.println((long) max);
//        for(int i=0;i<n;i++){
//            System.out.println(f[i].m+" "+f[i].s);
//        }
        pw.close();
    }
}

class Friends implements Comparable<Friends> {

    double m, s;
    Friends(double a, double b) {
        m = a;
        s = b;
    }
    @Override
    public int compareTo(Friends m2) {
        return Double.compare(m, m2.m);
    }
}
