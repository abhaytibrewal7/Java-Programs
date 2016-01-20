package NetworkingPrograms;

public class day2_3 {
    public static void main(String args[]) throws Exception{
        PrimeFibo q=new PrimeFibo();
        Prime p=new Prime(20,q);
        Fibonacci f=new Fibonacci(20,q);

    }
}

class PrimeFibo{
    
    
        int a=0;
        int b=1;
        int sum=a+b;        
    int n;
    boolean occu=false;
    synchronized void put(int n){
        if(occu){
            try{
                wait();
                
            }catch(Exception e){
                
            }
        }
        this.n=n;       
        int flag=0;
        int i;
            for(i=1;i<=n;i++){
                if(n%i==0)
                {
                    flag++;                                   
                }
            }
            if(flag==2){
                
            try{
                Thread.sleep(1000);               
            }catch(Exception e){
                System.out.println(e);
            }
                System.out.println("Prime:"+n);
                
            occu=true;
            notify();
                               
            }
        }
    synchronized int get(){
        if(occu==false){
            try{
                wait();
            }catch(Exception e){
                
            }            
        }        
        while(sum<=n){
            System.out.println("Fibonacci:"+sum);
            a=b;
            b=sum;
            sum=a+b;
                  
            try{
                Thread.sleep(1000);
            }catch(Exception e){
                System.out.println(e);
            }
        }
        occu=false;
        notify();
        return n;
    
    }    
    
}

class Prime extends Thread{
    int n;
    PrimeFibo q;
    Prime(int n,PrimeFibo q){
        this.n=n;
        this.q=q;
        start();
    }
    public void run(){
        for(int i=1;i<=20;i++)
            q.put(i);
    }
}


class Fibonacci extends Thread{
    int n;
    PrimeFibo q;
    Fibonacci(int n,PrimeFibo q){
        this.n=n;
        this.q=q;
        start();
    }
    public void run(){
      for(int i=1;i<=20;i++)
        q.get();
    }
}