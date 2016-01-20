package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class TwoStrings {
    public static void main(String args[])throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        String s=br.readLine();
        int flagAB=0,flagBA=0;
        int index=s.indexOf("AB");
        if(index!=-1){
            int index2=index+2;
            String ss=s.substring(index2);
            if(ss.indexOf("BA")!=-1)
                flagAB=1;
       }
       index=s.indexOf("BA");
        if(index!=-1){
            int index2=index+2;
            String ss=s.substring(index2);
            if(ss.indexOf("AB")!=-1)
                flagBA=1;
       }           
        if(flagAB==1 || flagBA==1)
            pw.println("YES");
        else
            pw.println("NO");
        pw.close();
    }            
}
