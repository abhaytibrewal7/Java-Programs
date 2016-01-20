package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class day8_2echoserver {
    public final static int DEFAULT_PORT=3456;
    public final static int qlen=3;
    public static void main(String args[])throws IOException{
                
           int port=DEFAULT_PORT;
           ServerSocket s=new ServerSocket(port,qlen);           
           int clientNo=0;                      
           
           while(true){
               Socket ss=s.accept();
               ++clientNo;
               new day8_2HandleClient(ss,clientNo).start();
               
           }
    }
}
