package GraphsEverything;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

class Vertex {

    int value;
    boolean visited;

    Vertex(int a) {
        value = a;
        visited = false;
    }
}

class Graph {

    Vertex vertex[];

    Stack<Integer> stack = new Stack<Integer>();
    ArrayList<ArrayList<Integer>> allComponent = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();
    int nvertex = 0;
    int time = 0;
    int low[];
    int disc[];            //time
    boolean onStack[];

    Graph(int a) {
        vertex = new Vertex[a + 1];
        low = new int[a + 1];
        disc = new int[a + 1];
        onStack = new boolean[a + 1];
        for (int i = 0; i < a; i++) {
            edges.add(new ArrayList<Integer>());
        }
    }

    void addVertex(int a) {
        vertex[nvertex++] = new Vertex(a);
    }

    void addEdge(int a, int b) {
        edges.get(a).add(b);
    }

    void DFS(int s) {

        low[s] = disc[s] = time++;
        stack.push(s);
        vertex[s].visited = true;
        onStack[s] = true;

        for (int w : edges.get(s)) {

            if (vertex[w].visited == false) {

                DFS(w);
                System.out.println("Dfs printing" + s);
                low[s] = Math.min(low[s], low[w]);

            } else if (onStack[w] == true) {
                low[s] = Math.min(low[s], disc[w]);
            }
        }

        ArrayList<Integer> component = new ArrayList<Integer>();

        int v = 0;
        if (low[s] == disc[s]) {
            component.add(s);
            while (stack.peek() != s) {
                v = stack.pop();
                component.add(v);
                onStack[v] = false;
            }
            v = stack.pop();
            component.add(v);
            onStack[v] = false;
            allComponent.add(component);
        }

    }

    void display() {

        Iterator<ArrayList<Integer>> it = allComponent.iterator();

        while (it.hasNext()) {

            ArrayList<Integer> arr = it.next();
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

public class TarjanAlgorithmStronglyConnectedComponent {

    public static void main(String args[]) throws IOException {
//
//        
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter pw = new PrintWriter(System.out);
//
//        int n = Integer.parseInt(br.readLine());
        Graph G = new Graph(11);
        for (int i = 0; i < 11; i++) {
            G.addVertex(i);
        }
//        
//        for (int i = 1; i <= n; i++) {
//            String s[] = br.readLine().split(" ");
//            int b = Integer.parseInt(s[0]);
//            int p = Integer.parseInt(s[1]);
//            G.addEdge(i, b);
//        }
//
        G.addEdge(0, 1);
        G.addEdge(1, 2);
        G.addEdge(0, 3);
        G.addEdge(2, 0);
        G.addEdge(5, 3);
        G.addEdge(3, 4);
        G.addEdge(4, 5);
        G.addEdge(4, 6);
        G.addEdge(3, 6);
        // G.addEdge(8, 0);
        G.addEdge(6, 7);
        G.addEdge(6, 9);
        G.addEdge(7, 8);
        G.addEdge(6, 10);

        for (int i = 0; i < 11; i++) {
            if (G.vertex[i].visited == false) {
                G.DFS(i);
            }
        }
        G.display();
    }
}
