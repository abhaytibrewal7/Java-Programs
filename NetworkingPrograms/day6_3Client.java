package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class day6_3Client {
    public static void main(String args[])throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket s=new DatagramSocket();
        InetAddress ip=InetAddress.getByName("localhost");
        byte[] send=new byte[1000];
        byte[] rec=new byte[1000];
        
        String ss=br.readLine();
        send=ss.getBytes();
        DatagramPacket sendpacket=new DatagramPacket(send,send.length,ip,1200);
        s.send(sendpacket);
        
        DatagramPacket recpacket=new DatagramPacket(rec,rec.length);
        s.receive(recpacket);
        
        String sss=new String(recpacket.getData(),0,recpacket.getLength());
        System.out.println(sss);
        
    }
}
