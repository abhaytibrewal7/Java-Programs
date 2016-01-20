//solved

package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Arrays;

class ChainAndDoughnuts {

    public static void main(String[] args) throws IOException {

        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s[]=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            Integer arr[]=new Integer[m];
            String s2[]=br.readLine().split(" ");
            for (int i = 0; i < m; i++) {
                arr[i]=Integer.parseInt(s2[i]);
            }
            Arrays.sort(arr, Collections.reverseOrder());          
            int chain = 0;
            int f1, f2, l1;
            int i=0,size=m-1;
            while((i+1)<size){
                f1=arr[i];
                f2=arr[i+1];
                
                l1=arr[size];
                arr[size]=l1-1;
                arr[i+1]=f1+f2+1;
                chain+=1;
                i++;
                if((l1-1)==0)
                    size-=1;
            }
            if((i+1)==size)
                chain+=1;
            pw.println(chain);
        }
        pw.close();
    }
}

