package NetworkingPrograms;

import java.io.*;
import java.net.*;


public class day7_3Client {
    public static void main(String args[])throws IOException{
        
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        DatagramSocket s=new DatagramSocket();
        InetAddress ip=InetAddress.getByName("localhost");
        System.out.println(ip);
        
        byte[] send=new byte[1000];
        byte[] rec=new byte[1000];
        while(true){
        
            System.out.print("Client:");
            String ss=br.readLine();
            send=ss.getBytes();
            
            DatagramPacket sendpacket=new DatagramPacket(send,send.length,ip,12000);
            s.send(sendpacket);
            
            if(ss.equals("bye"))
                break;
            
            DatagramPacket recpacket=new DatagramPacket(rec,rec.length);
            s.receive(recpacket);
            
            String s2=new String(recpacket.getData(),0,recpacket.getLength());
            System.out.println("Server:"+s2);                        
        }
        s.close();
    }
}
