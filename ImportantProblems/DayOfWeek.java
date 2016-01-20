package ImportantProblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DayOfWeek {

    public static void main(String[] args) throws IOException, ParseException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            String s[] = br.readLine().split(" ");
            int y = Integer.parseInt(s[0]);
            int m = Integer.parseInt(s[1]);
            int d = Integer.parseInt(s[2]);

            String dateString = String.format("%d-%d-%d", d, m, y);
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(dateString);

            String dayOfWeek = new SimpleDateFormat("EEEE").format(date);

            System.out.println(dayOfWeek);
        }
        pw.close();
    }
}
