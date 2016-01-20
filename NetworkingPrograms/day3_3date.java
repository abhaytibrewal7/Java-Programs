package NetworkingPrograms;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class day3_3date {

    public static void main(String args[]){
        Date date=new Date();
        SimpleDateFormat dd=new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss 'a' zzz") ;
        System.out.println("Date:"+(dd.format(date)));
    }
}
