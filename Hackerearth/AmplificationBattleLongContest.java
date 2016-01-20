//partial

package Hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class AmplificationBattleLongContest {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            String s[] = br.readLine().split(" ");
            double a = Double.parseDouble(s[0]);
            double b = Double.parseDouble(s[1]);
            double c = Double.parseDouble(s[2]);
            int turn = 1, flag = 1;
            double current = 1, secondCurrent = 1;
            double max = a > b ? a : b;
            double min = a < b ? a : b;
            while (current < c) {
                flag=1;
                if (turn == 1) {
                    if (current * max >= c || current * min >= c) {
                        flag=2;
                        System.out.println(turn +" "+ current);
                        current = current * max;
                    } else {
                        for (double i = current * max; i >= current * min; i--) {
                            secondCurrent = i;
                            System.out.println(turn +" Inside for "+ current+" i= "+i);
                            if (secondCurrent * max < c) {                                
                                current = i;
                                System.out.println(turn +" Inside for if "+ current+" i= "+i);
                                flag = 2;
                                break;
                            }
                            if (flag == 2) {
                                break;
                            }
                        }
                    }
                    if (flag == 1) {
                        System.out.println(turn+" flag 1");
                        current = current * min;
                    }
                    turn = 2;
                } else if (turn == 2) {
                    if (current * max >= c || current * min >= c) {
                        flag=2;
                        System.out.println(turn +" "+ current);
                        current = current * max;
                    } else {
                        for (double i = current * max; i >= current * min; i--) {
                            System.out.println(turn +" Inside for "+ current+" i= "+i);
                            secondCurrent = i * max;
                            if (secondCurrent < c) {                                
                                current = i;
                                System.out.println(turn +" Inside for if "+ current+" i= "+i);
                                flag = 2;
                                break;
                            }
                            if (flag == 2) {
                                break;
                            }
                        }
                    }
                    if (flag == 1) {
                        System.out.println(turn+" flag 1");
                        current = current * min;
                    }
                    turn = 1;
                }
            }
            if (turn == 2) {
                System.out.println("Adam");
                //pw.println("Adam");
            } else {
                System.out.println("Bob");
                //pw.println("Bob");
            }
        }
        pw.close();
    }
}
