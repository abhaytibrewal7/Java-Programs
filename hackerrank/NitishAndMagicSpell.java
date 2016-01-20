//Not solved.. no logic,,, :(

package hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;

class NitishAndMagicSpell {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw=new PrintWriter(System.out);
        
        int t=Integer.parseInt(br.readLine());
        while(t-->0){
            String s[]=br.readLine().split(" ");
            int n=Integer.parseInt(s[0]);
            int m=Integer.parseInt(s[1]);
            int k=Integer.parseInt(s[2]);
            int a[]=new int[n];
            String s1[]=br.readLine().split(" ");
            GraphN G=new GraphN(n);
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s1[i]);
                G.addVertex(i, a[i]);
            }
            for(int i=0;i<n-1;i++){
                String s2[]=br.readLine().split(" ");
                int x=Integer.parseInt(s2[0]);
                int y=Integer.parseInt(s2[1]);
                G.addEdge(x, y);
            }
            
            for(int i=0;i<n;i++){
                G.dfs(i);
            }
        }        
        pw.close();
    }
}
class VertexN{

    int a;
    int wt;
    boolean visited;
    VertexN(int a, int wt) {
        this.a = a;
        this.wt = wt;
        visited=false;
    }

}

class GraphN{

    VertexN vertex[];
    ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
    int nvertex = 0;

    GraphN(int a) {
        vertex = new VertexN[a];

        for (int i = 1; i <= a; i++) {
            arr.add(new ArrayList<Integer>());
        }
    }

    public final void addVertex(int a, int wt) {
        vertex[nvertex++] = new VertexN(a, wt);
    }

    public final void addEdge(int a, int b) {
        arr.get(a).add(b);
    }
    
    public void dfs(int a){
        
    }
}