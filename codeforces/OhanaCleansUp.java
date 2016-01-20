package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
        

public class OhanaCleansUp {
    public static void main(String args[])throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
 
        int n=Integer.parseInt(br.readLine());
        
        String arr1[]=new String[n];
        for(int i=0;i<n;i++){
            arr1[i]=br.readLine();
        }
        ArrayList a=new ArrayList(Arrays.asList(arr1));
        int freq[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++){
            freq[i]=Collections.frequency(a,a.get(i));
            if(freq[i] > max){
                max=freq[i];
            }
        }
        pw.println(max);
        pw.close();
    }
}
