package ImportantProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Permutations {
    static int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int t=Integer.parseInt(br.readLine());
        
        while(t-->0){
            String s=br.readLine();
            String s2=s;
            max=Integer.MIN_VALUE;
            min=Integer.MAX_VALUE;
            permute(s,0,s.length()-1,s2);

            if(min==Integer.MAX_VALUE)
                min=-1;
            if(max==Integer.MIN_VALUE)
                max=-1;
            
            System.out.println(max+" "+min);
            
        }
        
    }
    static void permute(String s,int k,int n,String s2){
        if(k==n){
            if(Integer.parseInt(s) > max && Integer.parseInt(s) < Integer.parseInt(s2) )
                max=Integer.parseInt(s);
            if(Integer.parseInt(s) < min && Integer.parseInt(s) > Integer.parseInt(s2))
                min=Integer.parseInt(s);                
        }
        else{
            for(int i=k;i<=n;i++){
                s=swapChars(s,i,k);
                permute(s,k+1,n,s2);
                s=swapChars(s, i, k);
                
            }
        }
    }
   static String swapChars(String str, int lIdx, int rIdx) {
        StringBuilder sb = new StringBuilder(str);
        char l = sb.charAt(lIdx), r = sb.charAt(rIdx);
        sb.setCharAt(lIdx, r);
        sb.setCharAt(rIdx, l);
        return sb.toString();
    }
}
