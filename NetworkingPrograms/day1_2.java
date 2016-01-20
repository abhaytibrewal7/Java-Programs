package NetworkingPrograms;

public class day1_2 {
    public static void main(String args[]){
        new FirstThread().start();
        try{
             Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println(e);
        }
        SecondThread obj=new SecondThread();
        Thread t=new Thread(obj);
        t.start();
        
    }
}

class FirstThread extends Thread{
    int a=1;
    public void run(){
        while(a<=10){
            try{
                System.out.println("First Thread:"+(a++));
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}


class SecondThread implements Runnable{
    int a=1;
    public void run(){
        while(a<=10){
            try{
                System.out.println("Second Thread:"+(a++));
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
