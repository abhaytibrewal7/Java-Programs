package NetworkingPrograms;

public class day1_3 {
    public static void main(String args[]){
        table obj=new table();
        new Thread1(obj).start();
        new Thread2(obj);
    }
}

class table{
    String name;
    void printtable(int n,String name1){
        for(int i=1;i<=5;i++){
            System.out.println(name1+":"+(n*i));
            try{
                Thread.sleep(1000);                
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class Thread1 extends Thread{
    
    table obj1;
    Thread1(table obj2){
        obj1=obj2;
    }
    public void run(){
        obj1.printtable(5,"Thread1");
    }
}

class Thread2 extends Thread{
    
    table obj1;
    Thread2(table obj2){
        obj1=obj2;
        start();
    }
    public void run(){
        obj1.printtable(4,"Thread2");
    }
}

