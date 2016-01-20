//solved
package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;

class DistinctCodes {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int n=Integer.parseInt(br.readLine());
        
        while(n-->0){
            String s=br.readLine();
            String a[]=new String[s.length()];
            ArrayList<String> arr=new ArrayList<String>();
            int flag=1;
            int c=0;
            for(int i=0;i<s.length()-1;i++){
                if(flag==1){
                    arr.add(""+s.charAt(i)+s.charAt(i+1));
                    flag=0;
                    c++;
                    //System.out.println("Enter for  jh"+  ""+s.charAt(i)+s.charAt(i+1));
                }

                else if(Collections.binarySearch(arr,(""+s.charAt(i)+s.charAt(i+1))) <0){
                 arr.add(""+s.charAt(i)+s.charAt(i+1));
                 c++;
                 //System.out.println("Enter for"+  ""+s.charAt(i)+s.charAt(i+1));
                 Collections.sort(arr);
                }    
                //System.out.println("ncc  "+ (""+s.charAt(i)+s.charAt(i+1))+ "  "+Collections.binarySearch(arr,(""+s.charAt(i)+s.charAt(i+1))));
                //System.out.println(arr);
            }
            pw.println(c);
        }        
        pw.close();
    }
}
