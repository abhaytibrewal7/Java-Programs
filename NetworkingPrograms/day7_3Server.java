package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class day7_3Server {
    public static void main(String args[])throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        DatagramSocket s=new DatagramSocket(12000);
        byte[] send=new byte[1000];
        byte[] rec=new byte[1000];
        
        while(true){
            System.out.println("Client:");
            DatagramPacket recpacket=new DatagramPacket(rec,rec.length);
            s.receive(recpacket);
            
            InetAddress ip=recpacket.getAddress();
            int port=recpacket.getPort();
            
            String s2=new String(recpacket.getData(),0,recpacket.getLength());
            System.out.println(s2);
            
            if(s2.equals("bye"))
                break;
            
            System.out.print("Server:");
            String s1=br.readLine();
            
            send=s1.getBytes();
            
            DatagramPacket senpacket=new DatagramPacket(send,send.length,ip,port);
            s.send(senpacket);                        
        }
        s.close();
    }
}
