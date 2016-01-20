package NetworkingPrograms;


import java.net.*;
import java.io.*;
public class day5_1Server {
    public static void main(String args[])throws IOException{
        
        ServerSocket s=new ServerSocket(1234);
        Socket s1=s.accept();
        
        PrintWriter pw=new PrintWriter(s1.getOutputStream(),true);
        
        pw.println("Hellllllooo");
        
        pw.close();
        s1.close();
    }
}
