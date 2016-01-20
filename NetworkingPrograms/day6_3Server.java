
package NetworkingPrograms;

import java.io.*;
import java.net.*;

public class day6_3Server {
    public static void main(String args[])throws IOException{
        
        DatagramSocket s=new DatagramSocket(1200);
        
        byte[] send=new byte[1000];
        byte[] rec=new byte[1000];
        while(true){
        
        DatagramPacket recpacket=new DatagramPacket(rec,rec.length);
        s.receive(recpacket);
        
        InetAddress ip=recpacket.getAddress();
        int port=recpacket.getPort();
        String ss=new String (recpacket.getData(),0,recpacket.getLength());
        System.out.println(ss);
        String abc="";
        for(int i=0;i<ss.length();i++){
            if(ss.charAt(i)== ' ')
                abc=abc+' ';
           else if ((int)ss.charAt(i) <= 90)
                    abc=(char)(ss.charAt(i)+32) + abc;
            else
                abc=(char)(ss.charAt(i)-32) + abc;
        
        }   
        System.out.println(abc);
        send=abc.getBytes();
        
        DatagramPacket senpacket=new DatagramPacket(send,send.length,ip,port);
        s.send(senpacket);
        }
    }
}
