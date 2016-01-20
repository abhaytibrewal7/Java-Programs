package NetworkingPrograms;

import java.io.*;
import java.net.*;
public class day5_2Server {
    public static void main(String args[])throws IOException{
        
        ServerSocket s=new ServerSocket(1235);
        Socket s1=s.accept();
        
        BufferedReader br=new BufferedReader(new InputStreamReader(s1.getInputStream()));
        PrintWriter pw=new PrintWriter(s1.getOutputStream(),true);
        
        String filename=br.readLine();
        System.out.println(filename);
        BufferedReader br1=new BufferedReader(new FileReader(filename));
        
        String s2;
        while((s2=br1.readLine())!=null)
            pw.println(s2);
        
        br1.close();
        pw.close();
        br.close();
                
                
    }
}
