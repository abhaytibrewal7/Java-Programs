package NetworkingPrograms;

public class day2_2 {
    public static void  main(String args[]){
        CriticalSection c=new CriticalSection();
        new thread1(c);
        new thread2(c);
    }
}

class thread1 extends Thread{
    
    CriticalSection c;
    thread1(CriticalSection c){
        this.c=c;
        start();
    }
    
    public void run(){
        int i=0;
        while(i<3)
            c.put(i++);
    }
    
}

class thread2 extends Thread{
    
    CriticalSection c;
    thread2(CriticalSection c){        
        this.c=c;
        start();        
    }
    
    public void run(){
        int i=0;
        while(i<3)
            c.get();
    }
}

class CriticalSection{
    
    String arr1[]={"Hi","How are you?","I am also doing fine!:)"};
    String arr2[]={"Hello!","I am fine.What about you?","Great!:D"};
    
    int n;
    boolean occu=false;
    synchronized int get(){
        
        if(occu==false){
            try{
                wait();                
            }catch(Exception e){
                
            }
        }
        System.out.println(arr2[n]);
        occu=false;
        notify();
        return n;                       
    }
    
    synchronized void put(int n){
        
       if(occu == true){
           try{
                wait();                
            }catch(Exception e){
                
            }
        }
        this.n=n;
        System.out.println(arr1[n]);
        occu=true;
        notify();
    }    
}