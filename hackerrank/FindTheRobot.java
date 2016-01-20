package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class FindTheRobot {
    public final static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            int n=Integer.parseInt(br.readLine());
            int totalLR=0;
            int totalUD=0;
            int k=1;
            for(int i=1;i<=n;i=i+2){
                totalLR=totalLR+(k*(i));
                k=-k;
            }
            k=1;
            for(int i=2;i<=n;i+=2){
                totalUD=totalUD+(k*i);
                k=-k;
            }
            pw.println(totalLR+" "+totalUD);
        }
        pw.close();
    }
}
