package NetworkingPrograms;

import java.net.InetAddress;

public class day3_4Inet {
    public static void main(String args[])throws Exception{
        InetAddress add=InetAddress.getLocalHost();
        System.out.println(add);
         InetAddress add1=InetAddress.getByName("www.google.com");
         System.out.println(add1);
         //byte abc[]={};
         //InetAddress add3[];
         //InetAddress add2=InetAddress.getByAddress(abc);
         //System.out.println(add2);
         
    }
}
