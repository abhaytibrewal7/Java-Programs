//solved

package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class AttackOnMactland {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        String cor[]=br.readLine().split(" ");
        double x=Double.parseDouble(cor[0]);
        double y=Double.parseDouble(cor[1]);
                
        double n=Double.parseDouble(br.readLine());
        
        int flag=0;
        for(int i=0;i<n;i++){
            String cor1[]=br.readLine().split(" ");
            double x1=Double.parseDouble(cor1[0]);
            double y1=Double.parseDouble(cor1[1]);
            double r= Double.parseDouble(cor1[2]);
            
            double eq = ((x1 - x)*(x1 - x)) - ((y1-y)*(y1-y));
            
            if(eq > (r*r)){
                flag=1;
                break;
            }
        }
        
        if(flag==1)
            pw.println("DEAD");
        else
            pw.println("ALIVE");
        pw.close();
    }
}
