package Hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class MarutAndGirls {
    public static void main(String args[])throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int m=Integer.parseInt(br.readLine());
        
        String s[]=br.readLine().split(" ");
        int arr[]=new int[m];
        for(int i=0;i<m;i++){
            arr[i]=Integer.parseInt(s[i]);
        }
        
        Arrays.sort(arr);
        int n=Integer.parseInt(br.readLine());        
        int k=0;
        for(int i=0;i<n;i++){
            StringTokenizer st=new StringTokenizer(br.readLine()," ");
            ArrayList<Integer> qualities=new ArrayList<Integer>();
            while(st.hasMoreTokens())
                qualities.add(Integer.parseInt(st.nextToken()));
            Collections.sort(qualities);
            int c=0;            
            if(qualities.size() < m)
                    c=0;
            else{
                for(int j=0;j<m;j++){
                    if(arr[i]==(qualities.get(i)))
                        c++;    
                    else 
                        break;
                }
            }
            if(c==m)
                k++;
        }
        pw.println(k);
        pw.close();
    }
}
