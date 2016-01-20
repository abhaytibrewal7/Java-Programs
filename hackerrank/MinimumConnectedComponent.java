//partial... many passed.. then tle

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;

class MinimumConnectedComponent {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);

        String s[] = br.readLine().split(" ");
        int n = Integer.parseInt(s[0]);
        int q = Integer.parseInt(s[1]);

        String s1[] = br.readLine().split(" ");
        int w[] = new int[n + 1];
        GraphM G = new GraphM(n + 1);
        for (int i = 1; i <= n; i++) {
            w[i] = Integer.parseInt(s1[i - 1]);
            G.addVertex(i, w[i]);
        }
        PriorityQueue<VertexM> pq = G.pq;
        for (int i = 1; i <= n; i++) {
            pq.add(G.vertex[i]);
        }
        while (q-- > 0) {
            String s2[] = br.readLine().split(" ");
            int x = Integer.parseInt(s2[0]);
            int y = Integer.parseInt(s2[1]);

            if (G.find(x) != G.find(y)) 
                G.union(x, y);
//
//                pq.remove(G.vertex[x]);
//                pq.remove(G.vertex[y]);
//
//                G.vertex[G.vertex[x].parent].wt += G.vertex[x].wt + G.vertex[y].wt;
//                pq.add(G.vertex[G.vertex[x].parent]);                
//            }
            pw.println(pq.peek().wt);
        }
//        for(int i=1;i<=n;i++){
//            System.out.println(i+" "+G.vertex[i].parent);
//        }

        pw.close();
    }
}

class VertexM implements Comparable<VertexM> {

    int a;
    int wt;
    int parent;
    int rank;

    VertexM(int a, int wt) {
        this.a = a;
        this.wt = wt;
        parent = a;
        rank = 0;
    }

    @Override
    public int compareTo(VertexM v) {
        return wt - v.wt;
    }
}

class GraphM {

    VertexM vertex[];
    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
    PriorityQueue<VertexM> pq = new PriorityQueue<VertexM>();
    int nvertex = 1;

    GraphM(int a) {
        vertex = new VertexM[a];

//        for (int i = 1; i <= a; i++) {
//            arr.add(new ArrayList<Integer>());
//        }
    }

    public final void addVertex(int a, int wt) {
        vertex[nvertex++] = new VertexM(a, wt);
    }

    public final void addEdge(int a, int b) {
        arr.get(a).add(b);
    }

    public int find(int x) {
        if (vertex[x].parent != x) {
            vertex[x].parent = find(vertex[x].parent);
        }
        return vertex[x].parent;
    }

    public void union(int a, int b) {

        int aParent = find(a);
        int bParent = find(b);

        if (aParent == bParent) {
            return;
        }

        if (vertex[aParent].rank > vertex[bParent].rank) {
            pq.remove(vertex[aParent]);
            pq.remove(vertex[bParent]);
            vertex[aParent].wt += vertex[vertex[bParent].parent].wt;                        
            vertex[bParent].parent = aParent;
            pq.add(vertex[aParent]);
        } else if (vertex[bParent].rank > vertex[aParent].rank) {
            pq.remove(vertex[bParent]);
            pq.remove(vertex[aParent]);
            vertex[bParent].wt += vertex[vertex[aParent].parent].wt;
            vertex[aParent].parent = bParent;
            pq.add(vertex[bParent]);
        } else {
            pq.remove(vertex[bParent]);
            pq.remove(vertex[aParent]);
            vertex[bParent].wt += vertex[vertex[aParent].parent].wt;
            vertex[aParent].parent = bParent;                        
            vertex[bParent].rank++;
            pq.add(vertex[bParent]);
        }
    }
}
