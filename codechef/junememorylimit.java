package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class junememorylimit {
    public static void main(String args[])throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            long a=Long.parseLong(br.readLine());
            long sum=0;
            String s[]=br.readLine().split(" ");
            long i=Long.parseLong(s[0]);
            sum=i;
            for(int k=1;k<a;k++){
                long j=Long.parseLong(s[k]);
                if(j > i)
                    sum=sum+(j-i);
                i=j;
            }
            System.out.println(sum);
        }
        
    }            
}
