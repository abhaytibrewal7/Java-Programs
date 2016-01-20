package codechef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class GravityGuy {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {

            String l1 = br.readLine();
            String l2 = br.readLine();
            int i1 = 0;
            int c = 0, c2 = 0;
            String lane = l1;
            int flag = 0, flag2 = 0;
            int i = 1;
            if (i == 1) {
                i = 2;
                if (l1.charAt(0) == '.') {
                    lane = l1;
                } else if (l2.charAt(0) == '.') {
                    lane = l2;
                }
                while (true) {
                    if (l1.charAt(0) == '#' && l2.charAt(0) == '#') {
                        flag = 1;
                        break;
                    }
                    if (i1 != lane.length() && (lane.charAt(i1) == '.')) {

                        while (i1 != lane.length() && (lane.charAt(i1) == '.')) {
                            i1++;
                        }
                    } else if (i1 != lane.length()) {
                        if (lane.equals(l1)) {
                            lane = l2;
                        } else {
                            lane = l1;
                        }
                        if (i1 != 0) {
                            i1--;
                        }
                        if (lane.length() != i1 && (lane.charAt(i1) == '.') && lane.charAt(i1 + 1) != '#') {
                            c++;
                            i1++;
                            continue;
                        } else if (lane.length() != (i1 + 1) && (lane.charAt(i1 + 1) == '.')) {
                            c++;
                            i1 += 2;
                            continue;
                        } else {
                            flag = 1;
                            break;
                        }
                    } else {
                        flag = 2;
                        break;
                    }
                }
            }
            if (i == 2) {
                if (l2.charAt(0) == '.') {
                    lane = l2;
                } else if (l1.charAt(0) == '.') {
                    lane = l1;
                }
                i1 = 0;
                while (true) {
                    if (l1.charAt(0) == '#' && l2.charAt(0) == '#') {
                        flag2 = 1;
                        break;
                    }
                    if (i1 != lane.length() && (lane.charAt(i1) == '.')) {

                        while (i1 != lane.length() && (lane.charAt(i1) == '.')) {
                            i1++;
                        }
                    } else if (i1 != lane.length()) {
                        if (lane.equals(l1)) {
                            lane = l2;
                        } else {
                            lane = l1;
                        }
                        if (i1 != 0) {
                            i1--;
                        }
                        if (lane.length() != i1 && (lane.charAt(i1) == '.') && lane.charAt(i1 + 1) != '#') {
                            c2++;
                            i1++;
                            continue;
                        } else if (lane.length() != (i1 + 1) && (lane.charAt(i1 + 1) == '.')) {
                            c2++;
                            i1 += 2;
                            continue;
                        } else {
                            flag2 = 1;
                            break;
                        }
                    } else {
                        flag2 = 2;
                        break;
                    }
                }
            }

            if (flag == 1 && flag2 == 1) {
                pw.println("No");
            } else if (flag == 2 && flag2 != 2) {
                pw.println("Yes");
                pw.println(c);
            } else if (flag2 == 2 && flag != 2) {
                pw.println("Yes");
                pw.println(c2);
            } else if (flag == 2 && flag2 == 2) {
                pw.println("Yes");
                if (c < c2) {
                    pw.println(c);
                } else {
                    pw.println(c2);
                }
            }
        
        }
        pw.close();
    }
}
