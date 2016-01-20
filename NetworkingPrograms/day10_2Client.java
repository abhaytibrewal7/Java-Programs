package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class day10_2Client extends Thread{
    
    static Socket s;
    day10_2Client(){
    try{
    
        s=new Socket("localhost",4567);        
        
    }catch(Exception e)
    {
        System.out.println(e);
    }
    start();    
    }
    public void run(){
        try{
           
            
            BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
            while(true){
                    System.out.println("Server:"+br1.readLine());
               
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void main(String args[])throws IOException{
        new day10_2Client();
        
        
        PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
            
         //System.out.print("Client:");
          pw.println(br.readLine());
        }
    }
}
