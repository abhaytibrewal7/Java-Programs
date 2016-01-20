//not solved

package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

class CleanerRobot {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        String s[] = br.readLine().split(" ");
        int w = Integer.parseInt(s[0]);
        int h = Integer.parseInt(s[1]);

        char a[][] = new char[w][h];
        int PosI = 0;
        int PosJ = 0;
        char value = 0;
        for (int i = 0; i < w; i++) {
            String s1 = br.readLine();
            for (int j = 0; j < h; j++) {
                a[i][j] = s1.charAt(j);
                if (a[i][j] == 'U' || a[i][j] == 'D' || a[i][j] == 'R' || a[i][j] == 'L') {
                    PosI = i;
                    PosJ = j;
                    value = a[i][j];
                    a[i][j] = '.';
                }
            }
        }
        boolean vis[][] = new boolean[w][h];
        int c = 0;
        int flag = 0;
        while (true) {
            flag = 0;
            if (value == 'U') {
                if (PosI >= 0 && PosI < w && PosJ >= 0 && PosJ < h && a[PosI][PosJ] == '.' && vis[PosI][PosJ] == false) {
                    c++;
                    System.out.println("U..");
                    vis[PosI][PosJ] = true;
                    if (PosI - 1 >= 0 && PosI - 1 < w && PosJ >= 0 && PosJ < h && a[PosI - 1][PosJ] == '.' && vis[PosI-1][PosJ] == false) {
                        PosI = PosI - 1;
                        value = 'U';
                    }
                } else {
                    if (PosI < 0) {
                        PosI = 0;
                    }
                    System.out.println("U else");
                    if (PosI >= 0 && PosI < w && PosJ + 1 >= 0 && PosJ + 1 < h && a[PosI][PosJ + 1] == '.' && vis[PosI][PosJ+1] == false) {
                        PosJ = PosJ + 1;
                        value = 'R';
                    } else if (PosI >= 0 && PosI + 1 < w && PosJ >= 0 && PosJ < h && a[PosI + 1][PosJ] == '.' && vis[PosI+1][PosJ] == false) {
                        PosI = PosI + 1;
                        value = 'D';
                    } else if (PosI >= 0 && PosI < w && PosJ - 1 >= 0 && PosJ - 1 < h && a[PosI][PosJ - 1] == '.' && vis[PosI][PosJ-1] == false) {
                        PosJ = PosJ - 1;
                        value = 'L';
                    } else {
                        break;
                    }

                }
            } else if (value == 'D') {
                if (PosI >= 0 && PosI < w && PosJ >= 0 && PosJ < h && a[PosI][PosJ] == '.' && vis[PosI][PosJ] == false) {
                    System.out.println("D..");
                    c++;
                    vis[PosI][PosJ] = true;
                    if (PosI >= 0 && PosI + 1 < w && PosJ >= 0 && PosJ < h && a[PosI + 1][PosJ] == '.' && vis[PosI+1][PosJ] == false) {
                        PosI = PosI + 1;
                        value = 'D';
                    }
                } else {
                    if (PosI >= w) {
                        PosI = w - 1;
                    }
                    System.out.println("D else");
                    if (PosI >= 0 && PosI < w && PosJ - 1 >= 0 && PosJ - 1 < h && a[PosI][PosJ - 1] == '.' && vis[PosI][PosJ-1] == false) {
                        PosJ = PosJ - 1;
                        value = 'L';
                    } else if (PosI - 1 >= 0 && PosI - 1 < w && PosJ >= 0 && PosJ < h && a[PosI - 1][PosJ] == '.' && vis[PosI-1][PosJ] == false) {
                        PosI = PosI - 1;
                        value = 'U';
                    } else if (PosI >= 0 && PosI < w && PosJ + 1 >= 0 && PosJ + 1 < h && a[PosI][PosJ + 1] == '.' && vis[PosI][PosJ+1] == false) {
                        PosJ = PosJ + 1;
                        value = 'R';
                    } else {
                        break;
                    }
                }
            } else if (value == 'R') {
                if (PosI >= 0 && PosI < w && PosJ >= 0 && PosJ < h && a[PosI][PosJ] == '.' && vis[PosI][PosJ] == false) {
                    System.out.println("R..");
                    c++;
                    vis[PosI][PosJ] = true;
                    if (PosI >= 0 && PosI < w && PosJ + 1 >= 0 && PosJ + 1 < h && a[PosI][PosJ + 1] == '.' && vis[PosI][PosJ+1] == false) {
                        PosJ = PosJ + 1;
                        value = 'R';
                    }
                } else {
                    if (PosJ >= h) {
                        PosJ = h - 1;
                    }
                    System.out.println("R else");
                    if (PosI + 1 >= 0 && PosI + 1 < w && PosJ >= 0 && PosJ < h && a[PosI + 1][PosJ] == '.' && vis[PosI+1][PosJ] == false) {
                        PosI = PosI + 1;
                        value = 'D';
                    } else if (PosI >= 0 && PosI < w && PosJ - 1 >= 0 && PosJ - 1 < h && a[PosI][PosJ - 1] == '.' && vis[PosI][PosJ-1] == false) {
                        PosJ = PosJ - 1;
                        value = 'L';
                    } else if (PosI - 1 >= 0 && PosI - 1 < w && PosJ >= 0 && PosJ < h && a[PosI - 1][PosJ] == '.' && vis[PosI-1][PosJ] == false) {
                        PosI = PosI - 1;
                        value = 'U';
                    } else {
                        break;
                    }
                }
            } else if (value == 'L') {
                if (PosI >= 0 && PosI < w && PosJ >= 0 && PosJ < h && a[PosI][PosJ] == '.' && vis[PosI][PosJ] == false) {
                    System.out.println("L..");
                    c++;
                    vis[PosI][PosJ] = true;
                    if (PosI >= 0 && PosI < w && PosJ - 1 >= 0 && PosJ - 1 < h && a[PosI][PosJ - 1] == '.' && vis[PosI][PosJ-1] == false) {
                        System.out.println("Entering..");
                        PosJ = PosJ - 1;
                        value = 'L';
                    }
                } else {
                    if (PosJ < 0) {
                        PosJ = 0;
                    }
                    System.out.println("L else");
                    if (PosI - 1 >= 0 && PosI - 1 < w && PosJ >= 0 && PosJ < h && a[PosI - 1][PosJ] == '.' && vis[PosI-1][PosJ] == false) {
                        System.out.println("Entering..U");
                        PosI = PosI - 1;
                        value = 'U';
                    } else if (PosI >= 0 && PosI < w && PosJ + 1 >= 0 && PosJ + 1 < h && a[PosI][PosJ + 1] == '.' && vis[PosI][PosJ+1] == false) {
                        System.out.println("Entering..R");
                        PosJ = PosJ + 1;
                        value = 'R';
                    } else if (PosI + 1 >= 0 && PosI + 1 < w && PosJ >= 0 && PosJ < h && a[PosI + 1][PosJ] == '.' && vis[PosI+1][PosJ] == false) {
                        System.out.println("Entering..D");
                        PosI = PosI + 1;
                        value = 'D';
                    } else {
                        System.out.println("Entering..brk");
                        break;
                    }
                }
            }
        }

        pw.println(c);
        pw.close();
    }
}
