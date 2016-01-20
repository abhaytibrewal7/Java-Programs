package codeforces;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.InputMismatchException;
//import java.util.Iterator;
//import java.util.ListIterator;
//import java.util.Stack;
//
//public class KefaAndPark {
//
//    public static void main(String[] args) throws IOException {
//        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter pw = new PrintWriter(System.out);
//
//        InputReader in = new InputReader(System.in);
//        int n = in.readInt();
//        int m = in.readInt();
////        String s[] = br.readLine().split(" ");
////        int n = Integer.parseInt(s[0]);
////        int m = Integer.parseInt(s[1]);
////
////        String s1[] = br.readLine().split(" ");
//        TreeGraph G = new TreeGraph(n + 1);
//        for (int i = 1; i <= n; i++) {
//            G.addNodes(i, in.readInt());
//        }
//        for (int i = 0; i < n - 1; i++) {
//            //String s3[] = br.readLine().split(" ");
//            int a = in.readInt();
//            int b = in.readInt();
//            G.addEdge(a, b);
//        }
//
//        G.dfs(1, m);
//        pw.println(G.total);
//        pw.close();
//    }
//}
//
//class Nodes {
//
//    int a, cat;
//    boolean visited;
//
//    Nodes(int a, int cat) {
//        this.a = a;
//        this.cat = cat;
//        this.visited = false;
//    }
//}
//
//class TreeGraph {
//
//    Nodes node[];
//    int total = 0;
//    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
//    Stack<Integer> stack = new Stack<Integer>();
//    int nvertex = 1;
//
//    int catPresent[];
//
//    TreeGraph(int a) {
//        node = new Nodes[a];
//        catPresent = new int[a];
//        for (int i = 1; i <= a; i++) {
//            arr.add(new ArrayList<Integer>());
//        }
//    }
//
//    public final void addNodes(int a, int b) {
//        node[nvertex++] = new Nodes(a, b);
//    }
//
//    public final void addEdge(int a, int b) {
//        arr.get(a).add(b);
//        arr.get(b).add(a);
//    }
//
//    public void dfs(int s, int m) {
//
//        stack.push(s);
//        node[s].visited = true;
//        if (node[s].cat == 1) {
//            catPresent[s] = 1;
//        }
//
//        while (!stack.isEmpty()) {
//            int peek = stack.peek();
//            int v = adjacent(stack.peek());
//            if (v == 0) {
//                int p = stack.pop();
//                if (catPresent[p] <= m && p != 1) {
//                    total++;
//                }
//            } else if (v == -1) {
//                int p = stack.pop();
//            } else {
//                stack.push(v);
//                if (catPresent[peek] > m) {
//                    catPresent[v] = catPresent[peek];
//                }
//                if (node[v].cat == 1 && catPresent[peek] >= 1) {
//                    catPresent[v] = catPresent[peek] + 1;
//                } else if (node[v].cat == 1) {
//                    catPresent[v]++;
//                }
//                if(catPresent[v] > m)
//                    stack.pop();
//            }
//        }
//    }
//
//    public int adjacent(int a) {
//        Iterator<Integer> it = arr.get(a).iterator();
//
//        int c = 0;
//        while (it.hasNext()) {
//            int v = it.next();
//            if (node[v].visited == false) {
//                node[v].visited = true;
//                return v;
//            }
//            c++;
//        }
//        if (c == 1) {
//            return 0;
//        }
//        return -1;
//    }
//}
//
//class InputReader {
//
//    private InputStream stream;
//    private byte[] buf = new byte[102400];
//    private int curChar;
//    private int numChars;
//    private SpaceCharFilter filter;
//
//    public InputReader(InputStream stream) {
//        this.stream = stream;
//    }
//
//    public int read() {
//        if (numChars == -1) {
//            throw new InputMismatchException();
//        }
//        if (curChar >= numChars) {
//            curChar = 0;
//            try {
//                numChars = stream.read(buf);
//            } catch (IOException e) {
//                throw new InputMismatchException();
//            }
//            if (numChars <= 0) {
//                return -1;
//            }
//        }
//        return buf[curChar++];
//    }
//
//    public int readInt() {
//        int c = read();
//        while (isSpaceChar(c)) {
//            c = read();
//        }
//        int sgn = 1;
//        if (c == '-') {
//            sgn = -1;
//            c = read();
//        }
//        int res = 0;
//        do {
//            if (c < '0' || c > '9') {
//                throw new InputMismatchException();
//            }
//            res *= 10;
//            res += c - '0';
//            c = read();
//        } while (!isSpaceChar(c));
//        return res * sgn;
//    }
//
//    public String readString() {
//        int c = read();
//        while (isSpaceChar(c)) {
//            c = read();
//        }
//        StringBuilder res = new StringBuilder();
//        do {
//            res.appendCodePoint(c);
//            c = read();
//        } while (!isSpaceChar(c));
//        return res.toString();
//    }
//
//    public double readDouble() {
//        int c = read();
//        while (isSpaceChar(c)) {
//            c = read();
//        }
//        int sgn = 1;
//        if (c == '-') {
//            sgn = -1;
//            c = read();
//        }
//        double res = 0;
//        while (!isSpaceChar(c) && c != '.') {
//            if (c == 'e' || c == 'E') {
//                return res * Math.pow(10, readInt());
//            }
//            if (c < '0' || c > '9') {
//                throw new InputMismatchException();
//            }
//            res *= 10;
//            res += c - '0';
//            c = read();
//        }
//        if (c == '.') {
//            c = read();
//            double m = 1;
//            while (!isSpaceChar(c)) {
//                if (c == 'e' || c == 'E') {
//                    return res * Math.pow(10, readInt());
//                }
//                if (c < '0' || c > '9') {
//                    throw new InputMismatchException();
//                }
//                m /= 10;
//                res += (c - '0') * m;
//                c = read();
//            }
//        }
//        return res * sgn;
//    }
//
//    public long readLong() {
//        int c = read();
//        while (isSpaceChar(c)) {
//            c = read();
//        }
//        int sgn = 1;
//        if (c == '-') {
//            sgn = -1;
//            c = read();
//        }
//        long res = 0;
//        do {
//            if (c < '0' || c > '9') {
//                throw new InputMismatchException();
//            }
//            res *= 10;
//            res += c - '0';
//            c = read();
//        } while (!isSpaceChar(c));
//        return res * sgn;
//    }
//
//    public boolean isSpaceChar(int c) {
//        if (filter != null) {
//            return filter.isSpaceChar(c);
//        }
//        return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
//    }
//
//    public String next() {
//        return readString();
//    }
//
//    public interface SpaceCharFilter {
//
//        public boolean isSpaceChar(int ch);
//    }
//}


import java.util.*;

public class KefaAndPark {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        int[] cats = new int[n];
        for (int i = 0; i < n; i++) {
            cats[i] = in.nextInt();
        }

        Graph g = new Graph(n, m, cats);

        for (int i = 0; i < n - 1; i++) {
            g.add(in.nextInt(), in.nextInt());
        }

        g.go();

        System.out.println( g.cnt );

    }

}

class Graph {

    int cnt;
    private int n, m;
    private int[] cats;
    private ArrayList<ArrayList<Integer>> adj;

    public Graph(int n, int m, int[] cats) {
        this.cnt = 0;
        this.n = n;
        this.m = m;
        this.cats = cats;
        this.adj = new ArrayList<ArrayList<Integer>>(n);
        for (int i = 0; i < n; i++) {
            this.adj.add(new ArrayList<Integer>());
        }
    }

    public void add(int i, int j) {
        this.adj.get(i - 1).add(j - 1);
        this.adj.get(j - 1).add(i - 1);
    }

    public void go() {
        dfs(0, 0, new boolean[n]);
    }

    private void dfs(int i, int c, boolean[] visited) {
        visited[i] = true;
        if (cats[i] == 1) {
            if (++c > m) return;
        } else {
            c = 0;
        }
        boolean isLeaf = true;
        for (int next : adj.get(i)) {
            if (!visited[next]) {
                dfs(next, c, visited);
                isLeaf = false;
            }
        }
        if (isLeaf) cnt++;
    }

}