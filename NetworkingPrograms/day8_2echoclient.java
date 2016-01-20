package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class day8_2echoclient {
    public static void main(String args[])throws IOException{
        
        Socket s=new Socket("localhost",3456);
        PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
        BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            System.out.println("Enter text to echo! End for exit");
            //System.out.flush();
            String s2=br.readLine();
            pw.println(s2);
            
            if(s2.equals("End"))
                break;
            
            System.out.println("Server:"+br1.readLine());
        }
        pw.close();
        br.close();
        br1.close();
        s.close();
    }
}
