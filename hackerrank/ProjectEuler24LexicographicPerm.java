//not done

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class ProjectEuler24LexicographicPerm {

    static String s[]=new String[10000000];
    static String req;
    static long k=1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
                
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            permute("abcdefghijklm",n);
            if(k==1)
                pw.println("abcdefghijklm");
            else
                pw.println(req);
        }
        pw.close();
    }

    static void permute(String input,long n) {
        int inputLength = input.length();
        boolean[] used = new boolean[inputLength];
        StringBuffer outputString = new StringBuffer();
        char[] in = input.toCharArray();

        doPermute(in, outputString, used, inputLength, 0,n);

    }

    static void doPermute(char[] in, StringBuffer outputString,
            boolean[] used, int inputLength, int level,long n) {
        if (level == inputLength) {
            k++;
            if(k == n)
                req=outputString.toString();
            return;
        }
        for (int i = 0; i < inputLength; ++i) {
            if (used[i]) {
                continue;
            }
            if(k==n)
                break;
            outputString.append(in[i]);
            used[i] = true;
            doPermute(in, outputString, used, inputLength, level + 1,n);
            used[i] = false;
            outputString.setLength(outputString.length() - 1);            
        }
    }
}
