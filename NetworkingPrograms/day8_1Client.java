package NetworkingPrograms;


import java.io.*;
import java.net.*;

public class day8_1Client {
    public static void main(String args[])throws IOException{
        
        Socket s=new Socket("localhost",4000);
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
        
        while(true){
            System.out.println("Enter 2 nos");
            
            String a=br.readLine();
            pw.println(a);
            
            if(a.equalsIgnoreCase("Bye"))
                break;
            
            String b=br.readLine();                        
            pw.println(b);
                                    
            System.out.println(br1.readLine());
            
            System.out.println("enter your choice");
            pw.println(br.readLine());
            
            System.out.println("Result from server:"+br1.readLine());                        
        }
        
        pw.close();
        br1.close();
        br.close();
    }
}
