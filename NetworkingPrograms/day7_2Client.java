package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class day7_2Client {
    public static void main(String args[])throws IOException{
        
        Socket s=new Socket("localhost",2000);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
        
        PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
        
        while(true){
            System.out.print("Client:");
            String ss=br.readLine();
            pw.println(ss);
            
            if(ss.equals("bye"))
                break;
            
            System.out.println("Server:"+br1.readLine());
        }
        
        pw.close();
        br1.close();
        br.close();
        s.close();
                
    }
}
