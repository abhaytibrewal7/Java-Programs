package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class day7_1Server {
    public static void main(String args[])throws IOException{
        
        ServerSocket s=new ServerSocket(2000);
        Socket s1=s.accept();
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br1=new BufferedReader(new InputStreamReader(s1.getInputStream()));
        
        PrintWriter pw=new PrintWriter(s1.getOutputStream(),true);
        
        while(true){
            String ss=br1.readLine();
            System.out.println("Client:"+ss);
            if(ss.equals("bye"))
                break;
            
            System.out.print("Server:");
            String s2=br.readLine();
            pw.println(s2);
        }
        
        pw.close();
        br1.close();
        br.close();
        s1.close();
    }
}
