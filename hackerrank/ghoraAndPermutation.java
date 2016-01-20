//solved but not for repition
package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ghoraAndPermutation {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String s = br.readLine();
        pw.println(rankPerm(s) % 1000003);

        pw.close();
    }

    public static int rankPerm(String perm) {
        int rank = 1;
        int suffixPermCount = 1;
        java.util.Map<Character, Integer> charCounts
                = new java.util.HashMap<Character, Integer>();
        for (int i = perm.length() - 1; i > -1; i--) {
            char x = perm.charAt(i);
            int xCount = charCounts.containsKey(x) ? charCounts.get(x) + 1 : 1;
            System.out.println(x+" "+xCount);
            charCounts.put(x, xCount);
            for (java.util.Map.Entry<Character, Integer> e : charCounts.entrySet()) {
                if (e.getKey() < x) {                    
                    rank = (rank + (((suffixPermCount * e.getValue()) % 1000003) / xCount)) % 1000003;
                    System.out.println(x+" "+xCount+" rank: "+rank);
                }
            }            
            suffixPermCount = (suffixPermCount * (perm.length() - i)) % 1000003;
            System.out.println(x+" "+xCount+" suffix: "+suffixPermCount);
            suffixPermCount /= xCount;
        }
        return rank;
    }
}
