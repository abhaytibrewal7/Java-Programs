package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class filerequestclient {
    public static void main(String args[])throws IOException{
        
        Socket s=new Socket("localhost",13000);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
        BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br2=null;
       
        String s2="E:\\125163\\Javaa Progs\\Main1\\src\\NetworkingPrograms\\abc.txt";
        File file=new File(s2);
        System.out.println(file.exists());
        pw.println(s2);
         String s3=br1.readLine();
         br2=new BufferedReader(new FileReader(s3));
         String s4;
         while((s4=br2.readLine())!=null){
           System.out.println(s4);  
         }
    
    
         pw.close();
         br2.close();
         br1.close();
         s.close();
    }
}
