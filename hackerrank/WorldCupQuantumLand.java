//partial

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class WorldCupQuantumLand {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        int n = Integer.parseInt(br.readLine());
        GraphQ G = new GraphQ(n + 1);
        for (int i = 1; i <= n; i++) {
            G.addVertex(i);
        }

        double arr[][] = new double[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            String s[] = br.readLine().split(" ");
            int b = Integer.parseInt(s[0]);
            int p = Integer.parseInt(s[1]);
            G.addEdge(i, b);
            arr[i][b] = p;
        }

        for (int i = 1; i <= n; i++) {
            if (G.vertex[i].visited == false) {
                G.dfs(i);
            }
        }
        double sum = 1;
        double sum2 = 0;
        ArrayList<ArrayList<Integer>> allComponent = G.allComponent;
        Iterator<ArrayList<Integer>> it = allComponent.listIterator();
        while (it.hasNext()) {
            ArrayList<Integer> ar = it.next();
            int c = ar.size() - 1;
            sum=1;
            if (c > 1) {
                for (int i = 0; i < c; i++) {
                    int x = ar.get(i + 1);
                    int y = ar.get(i);
                    sum = sum * ((arr[x][y]) / 100);
                }                
                sum2 = sum2 + sum;
            }
        }
        System.out.println(String.format("%.2f", sum2));
        pw.close();
    }
}

class VertexQ {

    boolean visited;
    int a;

    VertexQ(int b) {
        a = b;
        visited = false;
    }
}

class GraphQ {

    VertexQ vertex[];
    ArrayList<ArrayList<Integer>> edges = new ArrayList<ArrayList<Integer>>();
    ArrayList<ArrayList<Integer>> allComponent = new ArrayList<ArrayList<Integer>>();
    Stack<Integer> stack = new Stack<Integer>();
    int nvertex = 1, time = 1;
    boolean onStack[];
    int desc[], low[];

    GraphQ(int a) {
        vertex = new VertexQ[a + 1];
        onStack = new boolean[a + 1];
        desc = new int[a + 1];
        low = new int[a + 1];

        for (int i = 0; i < a; i++) {
            edges.add(new ArrayList<Integer>());
        }
    }

    public final void addVertex(int a) {
        vertex[nvertex++] = new VertexQ(a);
    }

    public final void addEdge(int a, int b) {
        edges.get(a).add(b);
    }

    public void dfs(int a) {
        stack.push(a);
        vertex[a].visited = true;
        onStack[a] = true;
        low[a] = desc[a] = time++;
        edges.get(a).stream().forEach((v) -> {
            if (vertex[v].visited == false) {
                dfs(v);
                low[a] = Math.min(low[a], low[v]);
            } else if (onStack[v] == true) {
                low[a] = Math.min(low[a], desc[v]);
            }
        });
        int w = 0;
        ArrayList<Integer> component = new ArrayList<Integer>();
        if (desc[a] == low[a]) {
            component.add(a);
            while (stack.peek() != a) {
                w = stack.pop();
                component.add(w);
                onStack[w] = false;
            }
            w = stack.pop();
            component.add(w);
            onStack[w] = false;
            allComponent.add(component);
        }
    }
    void display() {
        Iterator<ArrayList<Integer>> it = allComponent.listIterator();
        while (it.hasNext()) {
            ArrayList<Integer> arr = it.next();
            arr.stream().forEach((abc) -> {
                System.out.println(abc + " ");
            });
            System.out.println();
        }
    }
}
