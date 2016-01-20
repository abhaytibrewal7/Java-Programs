//solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;

class WorldCupTeamFormation {
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        
        Integer arr[] = new Integer[10];
        for(int i=0;i<10;i++)
            arr[i]=Integer.parseInt(br.readLine());
        
        Arrays.sort(arr, Collections.reverseOrder());
        int sum = arr[0]+arr[2]+arr[4];
        pw.println(sum);
        
        pw.close();
    }
}