//not solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;

class PerfectArray {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");
        long a[]=new long[n+1];
        long even[]=new long[n+1];
        long odd[]=new long[n+1];
        long sorted[]=new long[n+1];
        int e=0,o=0;
        for(int i=1;i<=n;i++){
            a[i]=Long.parseLong(s[i-1]);
            if(a[i]%2==0)
                even[e++]=a[i];
            else
                odd[o++]=a[i];
        }
        
        Arrays.sort(even,0,e);
        Arrays.sort(odd,0,o);
        e=0;o=0;
        int k=0;
        for(int i=1;i<=n;i++){
            if(k==0){
                sorted[i]=odd[o++];
                k=1;
            }
            else{
                sorted[i]=even[e++];
                k=0;
            }                            
        }
//        for(int i=0;i<e;i++)
//            System.out.print(even[i]+" ");
//        System.out.println();
//        for(int i=0;i<o;i++)
//            System.out.print(odd[i]+" ");        
//        System.out.println("");
//        for(int i=1;i<=n;i++)
//            System.out.print(sorted[i]+" ");        
//        System.out.println("");
        k=1;
        int swaps=0;
//        for(int i=1;i<=n;i++){
//            if(a[i]==sorted[k])
//                k++;
//            else
//                swaps=swaps+1;
//        }
        
        for(int i=1;i<=n;i++){
            if(a[i]!=sorted[i])
                swaps+=1;
        }
        
        pw.println((swaps/2)+1);
        pw.close();
    }
}
