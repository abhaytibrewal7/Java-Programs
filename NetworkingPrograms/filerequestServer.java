package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class filerequestServer {
    public static void main(String args[])throws Exception{
        
        ServerSocket s=new ServerSocket(13000);
        Socket ss=s.accept();
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(ss.getOutputStream(),true);
        BufferedReader br1=new BufferedReader(new InputStreamReader(ss.getInputStream()));
        BufferedReader br2=null;
         BufferedWriter br3=null;
        
        String s3="E:\\125163\\Javaa Progs\\Main1\\src\\NetworkingPrograms\\bcd.txt";
         File file=new File(s3);
         System.out.println(file.exists());
        
        String s2=br1.readLine();
        System.out.println(s2);
        
        br2=new BufferedReader(new FileReader(s2));
        br3=new BufferedWriter(new FileWriter(s3));
        String s4;
        while((s4=br2.readLine())!=null)
            br3.write(s4+"\n");
        
        pw.println(s3);
        
        pw.close();
        br3.close();
        br2.close();
        ss.close();
    }
}
