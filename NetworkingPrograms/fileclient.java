package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class fileclient {
    public static void main(String args[])throws Exception{
        
        Socket s=new Socket("localhost",15000);
        
        BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
        
        BufferedReader fr=null;
        
        String s1="E:\\125163\\Javaa Progs\\Main1\\src\\NetworkingPrograms\\abc.txt";
        pw.println(s1);
        
        String s2=br1.readLine();
        System.out.println(s2);
        fr=new BufferedReader(new FileReader(s2));
        
        String s3;
        while((s3=fr.readLine())!=null)
            System.out.println(s3);
            
        
        fr.close();
        pw.close();
        br1.close();
        s.close();
    }
}
