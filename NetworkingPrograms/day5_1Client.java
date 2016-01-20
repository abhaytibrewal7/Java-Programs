package NetworkingPrograms;

import java.io.*;
import java.net.*;
public class day5_1Client {
    public static void  main(String args[])throws IOException{
        Socket s1=new Socket("localhost",1234);
        BufferedReader br=new BufferedReader(new InputStreamReader(s1.getInputStream()));
        
        System.out.println(br.readLine());
        
        br.close();
    }
}
