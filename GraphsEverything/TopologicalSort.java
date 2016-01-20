package GraphsEverything;



/*

DFS wala class me kiye h...woi better h...this is like this only...
same package DFS class...stackSorted me store karte ja rahe...popped valued..
aand usko reverse karke print....only this much is topological sort

*/




import java.util.*;

public class TopologicalSort {

  static void dfs(List<Integer>[] graph, boolean[] used, List<Integer> res, int u) {
    used[u] = true;
    for (int v : graph[u])
      if (!used[v])
        dfs(graph, used, res, v);
    res.add(u);
  }

  public static List<Integer> topologicalSort(List<Integer>[] graph) {
    int n = graph.length;
    boolean[] used = new boolean[n];
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < n; i++)
      if (!used[i])
        dfs(graph, used, res, i);
    Collections.reverse(res);
    return res;
  }

  // Usage example
  public static void main(String[] args) {
    int n = 6;
    List<Integer>[] g = new List[n];
    for (int i = 0; i < n; i++) {
      g[i] = new ArrayList<>();
    }
    
    
    g[4].add(1);
    g[4].add(0);
    g[5].add(0);
    g[5].add(2);
    g[2].add(3);
    g[3].add(1);

    List<Integer> res = topologicalSort(g);
    System.out.println(res);
  }
}