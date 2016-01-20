///wrong h


package hackerrank;

import java.util.Calendar;
import java.util.Date;

public class CountFridaysThe13th {

    public static void main(String[] args) {

        Date d1;//getDate("01 10 2000");
        Calendar c1 = Calendar.getInstance();
        //c1.setTime(d1);

        Calendar c2 = Calendar.getInstance();
        //c2.setTime(d2);

        int sundays = 0;

        while (c1.after(c2)) {
            if (c2.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
                sundays++;
            }
            c2.add(Calendar.DATE, 1);
        }
        System.out.println(sundays);
    }
}
