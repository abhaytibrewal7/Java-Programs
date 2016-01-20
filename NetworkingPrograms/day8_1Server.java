package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class day8_1Server {
    public static void main(String args[])throws IOException
    {
        ServerSocket s=new ServerSocket(4000);
        Socket s1=s.accept();
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br1=new BufferedReader(new InputStreamReader(s1.getInputStream()));
        PrintWriter pw=new PrintWriter(s1.getOutputStream(),true);
        
        String s2="1.Add 2.Subtract 3.Multiply 4.Divide";
        
        while(true){
            
            String abc=br1.readLine();
            if(abc.equalsIgnoreCase("bye"))
            {
                pw.println("BYEEE");
                break;
            }
            int a=Integer.parseInt(abc);
            int b=Integer.parseInt(br1.readLine());
            
            System.out.println("Nos are :"+a+" "+b);
            
            pw.println(s2);
            
            int choice=Integer.parseInt(br1.readLine());
            int result=0;
            switch(choice){
                case 1:
                    result=a+b;
                    break;
                case 2:
                    result=a-b;
                    break;
                case 3:
                    result=a*b;
                    break;
                case 4:
                    result=a/b;
                    break;
                default:
                    pw.println("Invalid Input");
            }
            
            System.out.println("Compute Result:"+result);
            pw.println(result);
        }
    }
}
