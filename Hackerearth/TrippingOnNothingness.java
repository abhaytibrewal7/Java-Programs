//solved
package Hackerearth;

import java.io.*;
import java.util.*;

class TrippingOnNothingness {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        String s[]=br.readLine().split(" ");
        int S=Integer.parseInt(s[0]);
        int Q=Integer.parseInt(s[1]);
        ArrayList<Integer> arr=new ArrayList<Integer>();
        while(Q-->0){
            int B=Integer.parseInt(br.readLine());
            int ans = gcd(S,B);
            
            if(!arr.isEmpty() && Collections.binarySearch(arr, ans)>=0)
                pw.println("-1");
            else{
                arr.add(ans);
                pw.println(ans);
                Collections.sort(arr);
            }                
        }
        pw.close();
    }
    public static int gcd(int a,int b){        
        if(b==0)
            return a;
        else
            return gcd(b,a%b);            
    }
}

