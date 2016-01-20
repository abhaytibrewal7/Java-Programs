package Hackerearth;


//////////with reference to 12 hour nd minute kitna angle move kiya in specified minutes
///hourhand--1 minute me 0.5 move kaarta h
///minute hand--- 1 minute me 6 degrees move karta h


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MinuteHourAngle {
    public static void main(String args[])throws IOException{
     
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            int t=Integer.parseInt(br.readLine());
            
            while(t-->0){
                  String s[]=br.readLine().split(" ");
                  int h=Integer.parseInt(s[0]);
                  int m=Integer.parseInt(s[1]);
                  
                  if(h==12)
                      h=0;
                  if(m==60)
                      m=0;
                  
                  double hangle=(h*60 + m)*0.5;
                  double mangle=m*6;
                  
                  int diff=Math.abs((int)hangle-(int)mangle);
                  
                  int minangle=Math.min(360-diff, diff);
                  
                  System.out.println(minangle);
                  
            }
    }
}
