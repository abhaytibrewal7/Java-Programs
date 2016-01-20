//partial solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class ProjectEuler19CountingSundays {

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s[] = br.readLine().split(" ");
            String s1[] = br.readLine().split(" ");

            //long y = Long.parseLong(s[0]);
            String y=s[0];
            int m = Integer.parseInt(s[1]);
            int d = Integer.parseInt(s[2]);

            //long y2 = Long.parseLong(s1[0]);
            String y2=s1[0];
            int m2 = Integer.parseInt(s1[1]);
            int d2 = Integer.parseInt(s1[2]);
            int c = 0;
            int startMon = 0, endMon = 0;
            if (d == 1) {
                startMon = m;
            } else {
                startMon = m + 1;
            }
            for (int i = startMon; i <= 12; i++) {
                String dateString = String.format("%d-%d-%s", 1, i, y);
                Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
                String dayOfWeek = new SimpleDateFormat("EEEE").format(date);
                if (dayOfWeek.equals("Sunday")) {
                    System.out.println(date.toString());
                    c++;
                }
            }
            for (int i = 1; i <= endMon; i++) {
                String dateString = String.format("%d-%d-%s", 1, i, y2);
                Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
                String dayOfWeek = new SimpleDateFormat("EEEE").format(date);
                if (dayOfWeek.equals("Sunday")) {
                    System.out.println(date.toString());
                    c++;
                }
            }
            int x =((new BigInteger(y2)).subtract(new BigInteger(y))).intValue();
            for (int i = 1; i < x; i++) {
                for (int j = 1; j <= 12; j++) {
                    String sY = ((new BigInteger(y)).add(new BigInteger(String.valueOf(i)))).toString();
                    String dateString = String.format("%d-%d-%s", 1, j, sY);
                    Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
                    String dayOfWeek = new SimpleDateFormat("EEEE").format(date);
                    if (dayOfWeek.equals("Sunday")) {
                        System.out.println(date.toString());
                        c++;
                    }
                }
            }
            pw.println(c);
        }
        pw.close();
    }
}
