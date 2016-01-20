package Hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;


class SortingNames {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());        
        ArrayList<String> arr=new ArrayList<String>();
        
        for(int i=0;i<t;i++){
            arr.add(br.readLine());            
        }
        TreeSet<String> set=new TreeSet<String>(arr);
        for(String x: set){
            System.out.println(x+" "+Collections.frequency(arr, x));
        }
    }
}
