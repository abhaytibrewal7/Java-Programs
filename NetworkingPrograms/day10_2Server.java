package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class day10_2Server extends Thread{
    
    ServerSocket s=null;
    static Socket ss;
    day10_2Server(){
    try{
        s=new ServerSocket(4567);
        ss=s.accept();
    }catch(Exception e)
    {
        System.out.println("Error");
    }
    start();    
    }
    
    public void run(){
        
        try{
            BufferedReader br1=new BufferedReader(new InputStreamReader(ss.getInputStream()));
            while(true){
            String s2=br1.readLine();
            System.out.println("Client:"+s2);                    
            }
    }catch(Exception e){
        System.out.println(e);
    }            
    }
    
    public static void main(String args[])throws IOException{
        new day10_2Server();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(ss.getOutputStream(),true);
        
        while(true){
         //   System.out.print("Server:");
            String s3=br.readLine();
            pw.println(s3);
        }
    }
    
}