//not solved

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

public class WorldCupGame {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        String s[] = br.readLine().split(" ");
        Graph G = new Graph(n + 1);
        int max = 0, vertex = 0, max2 = 0, vertex2 = 0;
        for (int i = 1; i <= n; i++) {
            int t = Integer.parseInt(s[i - 1]);
            G.addVertex(i, t);
            if (t > max) {
                max = t;
                vertex = i;
            }
        }
        for (int i = 1; i <= n; i++) {
            if (G.vertex[i].token > max2 && G.vertex[i].a != vertex) {
                max2 = G.vertex[i].token;
                vertex2 = i;
            }
        }
        //System.out.println(vertex+" "+vertex2);
        for (int i = 0; i < n - 1; i++) {
            s = br.readLine().split(" ");
            G.addEdge(Integer.parseInt(s[0]), Integer.parseInt(s[1]));
        }        
        pw.println(G.bfs(vertex, vertex2));
        pw.close();
    }
}

class Vertex {

    int a;
    int token;
    boolean visited;
    int key;

    Vertex(int b, int t) {
        a = b;
        token = t;
        visited = false;
        key = 0;
    }
}

class Graph {

    ArrayList<ArrayList<Integer>> adg;
    PriorityQueue<Vertex> queue1;
    PriorityQueue<Vertex> queue2;
    int nvertex = 1;
    Vertex vertex[];
    int token1 = 0, token2 = 0;

    Graph(int v) {
        queue1 = new PriorityQueue<Vertex>(v, new Comparator<Vertex>() {
            @Override
            public int compare(Vertex v1, Vertex v2) {
                return v1.key - v2.key;
            }
        });
        queue2 = new PriorityQueue<Vertex>(v, new Comparator<Vertex>() {
            @Override
            public int compare(Vertex v1, Vertex v2) {
                return v1.key - v2.key;
            }
        });
        vertex = new Vertex[v];
        adg = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < v; i++) {
            adg.add(new ArrayList<Integer>());
        }
    }

    public void addVertex(int a, int b) {
        vertex[nvertex++] = new Vertex(a, b);
    }

    public void addEdge(int a, int b) {
        adg.get(a).add(b);
        adg.get(b).add(a);
    }

    int turn = 1;

    public int bfs(int s, int s2) {
        for (int i = 1; i < nvertex; i++) {
            queue1.offer(vertex[i]);
            queue2.offer(vertex[i]);
        }
        int v;
        int max = 0;
        int token1 = 0;
        int token2 = 0;
        vertex[s].key = vertex[s].token;
        vertex[s2].key = vertex[s2].token;
        //vertex[s].visited = true;
        //vertex[s2].visited = true;
        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            if (turn == 1 && (!queue1.isEmpty())) {
                while (true) {
                    if (!(queue1.isEmpty()) && queue1.peek().visited == true) {
                        //System.out.println("1" + queue1.peek().a);
                        queue1.poll();
                    } else {
                        break;
                    }
                }
                if (!queue1.isEmpty()) {
                    Vertex w = queue1.poll();
                    //System.out.println("inside 1 " + w.a + " " + w.token);
                    if (w.visited == false) {
                        token1 += vertex[w.a].token;
                    }
                    w.visited = true;
                    if (!queue2.isEmpty()) {
                        turn = 2;
                    }
                    Iterator<Integer> it = adg.get(w.a).iterator();

                    while (it.hasNext()) {
                        v = it.next();
                        if (queue1.contains(vertex[v]) && (vertex[v].visited == false) && (vertex[v].token + w.key > vertex[v].key)) {
                            queue1.remove(vertex[v]);
                            vertex[v].key = vertex[v].token + w.key;
                            queue1.offer(vertex[v]);
                        }
                    }
                }
            }
            if (turn == 2 && (!queue2.isEmpty())) {
                while (true) {
                    if (!queue2.isEmpty() && queue2.peek().visited == true) {
                        //System.out.println(queue2.peek().a);
                        queue2.poll();
                    } else {
                        break;
                    }
                }
                if (!queue2.isEmpty()) {
                    Vertex w = queue2.poll();
                    //System.out.println("inside 2 " + w.a + " " + w.token);
                    if (w.visited == false) {
                        token2 += vertex[w.a].token;
                    }
                    w.visited = true;
                    if (!queue1.isEmpty()) {
                        turn = 1;
                    }
                    Iterator<Integer> it = adg.get(w.a).iterator();

                    while (it.hasNext()) {
                        v = it.next();
                        if (queue2.contains(vertex[v]) && (vertex[v].visited == false) && (vertex[v].token + w.key > vertex[v].key)) {
                            queue2.remove(vertex[v]);
                            vertex[v].key = vertex[v].token + w.key;
                            queue2.offer(vertex[v]);
                        }
                    }
                }
            }
        }
        return token1;
    }
}
