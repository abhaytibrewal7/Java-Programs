package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class fileServer {
    public static void main(String args[])throws Exception{
        
        ServerSocket ss=new ServerSocket(15000);
        Socket s=ss.accept();
        
        BufferedReader br1=new BufferedReader(new InputStreamReader(s.getInputStream()));
        PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
        BufferedReader br2=null;
        BufferedWriter br3=null;
        
        String s1=br1.readLine();
        String s2="E:\\125163\\Javaa Progs\\Main1\\src\\NetworkingPrograms\\bcd.txt";
        File file=new File(s2);
        System.out.println(file.exists());
                
        br2=new BufferedReader(new FileReader(s1));
        br3=new BufferedWriter(new FileWriter(s2));
        
        String s3;
        while((s3=br2.readLine())!=null){
            br3.write(s3+"\n");
        }
        pw.println(s2);
        pw.close();
        br1.close();
        br2.close();
        br3.close();
        s.close();
                
    }
}
