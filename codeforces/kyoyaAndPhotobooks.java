package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;

public class kyoyaAndPhotobooks {
    public static void main(String args[])throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        String s=br.readLine();
        HashSet arr=new HashSet();
        for(int i=0;i<s.length();i++){
            arr.add(s.charAt(i));
        }
        
        int l=s.length();
        
        int possibleCombination=(26*(l+1))-(l);
        pw.println(possibleCombination);
        pw.close();
    }
    
}
