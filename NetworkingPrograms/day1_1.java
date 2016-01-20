/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NetworkingPrograms;
import java.io.IOException;


public class day1_1 {
    public static void main(String args[])throws IOException{
        MyFirstThread obj=new MyFirstThread();
        obj.start();
        while(obj.c <=10){
            try{
                System.out.println("Inside main:"+(++obj.c));
                Thread.sleep(999);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        
        System.out.println("Main End :)");
    }
    
}

class MyFirstThread extends Thread{
    
    int c=0;
    public void run(){
        while(c<=10){
            try{
                System.out.println("Inside My:"+(++c));   
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
             System.out.println(e);   
            }
        }
    }
}


