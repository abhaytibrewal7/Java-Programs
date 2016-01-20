package NetworkingPrograms;

import java.io.*;
import java.net.*;
public class day6_1Client {
    public static void main(String args[])throws IOException
    {
     DatagramSocket s=new DatagramSocket();
     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     
     InetAddress ip=InetAddress.getByName("localhost");
     System.out.println(ip);
     
     System.out.println("enter string");
     String s1=br.readLine();
     
     byte[] senddata=new byte[1000];
     byte[] receivedata=new byte[1000];
     
     senddata=s1.getBytes();
     DatagramPacket sendpacket=new DatagramPacket(senddata,senddata.length,ip,1236);
     s.send(sendpacket);
     
     DatagramPacket receivepacket=new DatagramPacket(receivedata,receivedata.length);
     s.receive(receivepacket);
     
     String newString=new String(receivepacket.getData(),0,receivepacket.getLength());
     System.out.println(newString);
     
     s.close();
     
     
    }
}
