package NetworkingPrograms;

import java.io.*;
import java.net.*;
public class day5_2Client {
    public static void main(String args[])throws IOException{
        
        Socket s1=new Socket("localhost",1235);
        BufferedReader br=new BufferedReader(new InputStreamReader(s1.getInputStream()));
        
        PrintWriter pw=new PrintWriter(s1.getOutputStream(),true);
        pw.println("src\\NetworkingPrograms\\abc.txt");
        String s;
        while((s=br.readLine())!=null)
            System.out.println(s);
        
        pw.close();
        br.close();
        s1.close();
    }
}
