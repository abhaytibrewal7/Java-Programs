package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class Clost {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String s[]=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            
            char a[]=new char[n];
            int c=0;
            for(int i=0;i<n;i++){
                
                if(c==0){
                    a[i]='(';
                    c=1;
                }
                else{
                    a[i]=')';
                    c=0;
                }
            }
            
            for(int i=0;i<k;i++){
                String s1[]=br.readLine().split(" ");
                int x=Integer.parseInt(s1[0]);
                int y=Integer.parseInt(s1[1]);
                c=0;
                while(x <= y){
                    if(c==0){
                        a[x]='(';
                        c=1;                      
                    }
                    else{
                        a[x]=')';
                        c=0;                       
                    }
                    x++;
                }
            }
            System.out.println(a);           
            pw.println(a);
        }
        pw.close();
    }
}
