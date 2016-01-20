package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class day6_1Server {
    public static void main(String args[])throws IOException{
        
        DatagramSocket s=new DatagramSocket(1236);
        byte[] send=new byte[1000];
        byte[] rec=new byte[1000];
        while(true){
            DatagramPacket recevepacket=new DatagramPacket(rec,rec.length);
            s.receive(recevepacket);
            
            InetAddress ip=recevepacket.getAddress();
            int port=recevepacket.getPort();
            
            String sss=new String(recevepacket.getData(),0,recevepacket.getLength());
            System.out.println(sss);
            String s2=sss.toUpperCase();
            
            send=s2.getBytes();
            
            DatagramPacket sendpacket=new DatagramPacket(send,send.length,ip,port);
            s.send(sendpacket);
            
            
        }
    }
}
