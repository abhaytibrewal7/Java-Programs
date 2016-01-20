package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class day8_2HandleClient extends Thread{
    private Socket clientSocket=null;
    private int clientNo=0;
    
   public day8_2HandleClient(Socket s,int c){
        clientSocket=s;
        clientNo=c;
    }
    public void run(){
        try{
            PrintWriter pw=new PrintWriter(clientSocket.getOutputStream(),true);
            System.out.println("Connection from"+clientSocket.getInetAddress());
            BufferedReader br1=new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));                        
        
        while(true){
            String s2=br1.readLine();
            System.out.println("From Client  "+clientNo+":"+s2);
            pw.println("Hello from "+InetAddress.getLocalHost()+ " to ClientNo "+clientNo);
            
            if(s2.equals("End"))
                break;
        }
        System.out.println("Client "+clientNo + " CLosed");
        pw.close();
        br1.close();
        clientSocket.close();
        }
        catch(Exception e){
            System.err.println("Connection error");
        }
    }        
}
