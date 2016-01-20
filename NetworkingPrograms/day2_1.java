package NetworkingPrograms;

public class day2_1 {
    public static void main(String args[]){
        Q q=new Q();
        new Producer(q);
        new Consumer(q);
    }
}

class Producer extends Thread{
    
    Q q;
    Producer(Q q){
        this.q=q;
        start();
    }
    public void run(){
        int i=1;
        while(i<=10)
            q.put(i++);
    }
}

class Consumer extends Thread{
    
    Q q;
    Consumer(Q q){
        this.q=q;
        start();
    }
    public void run(){
        while(true)
            q.get();
    }
}


class Q{
    
    int n;
    boolean occupied=false;
    synchronized int get(){
        while(occupied==false){
        
            try{
                wait();
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
        try{
            System.out.println("Consumer:"+n);
            Thread.sleep(1000);
        }catch(Exception e){
            
        }
        occupied=false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while(occupied){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println(e);
            }
        }
        this.n=n;
        try{
            System.out.println("Producer:"+n);
            Thread.sleep(1000);
        }catch(Exception e){
            
        }
        occupied=true;
        notify();
    }
}