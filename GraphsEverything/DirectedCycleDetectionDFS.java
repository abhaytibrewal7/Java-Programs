//package GraphsEverything;
//
//import java.util.ArrayList;
//import java.util.Stack;
//
//public class DirectedCycleDetectionDFS {
//
//    public static void main(String[] args) {
//
//        Graph G = new Graph(8);
//
//        for (int i = 0; i < 8; i++) {
//            G.addVertex(i);
//        }
//
//        
//        G.addEdge(0, 1);
//        G.addEdge(0, 2);
//        G.addEdge(2, 6);
//        G.addEdge(2, 3);
//        G.addEdge(0, 3);
//        G.addEdge(3, 4);
//        G.addEdge(4, 5);
//        G.addEdge(5, 7);
//        G.addEdge(7, 4);
//        G.addEdge(6, 7);
//        
//        for (int i = 0; i < 8; i++) {
//            if (G.vertex[i].visited == false) {
//                System.out.println(i);   
//                G.dfs(i);
//            }
//        }
//        
//        if(!G.cycle.isEmpty()){
//              System.out.println("Cycle");
//            for(int i : G.cycle)
//                System.out.println(i+" ");
//            System.out.println();
//        }
//        else
//            System.out.println("Acyclic");                                        
//    }
//    
//}
//
//class Vertex {
//
//    int value;
//    boolean visited;
//
//    Vertex(int a) {
//        value = a;
//        visited = false;
//    }
//}
//
//class Edge {
//
//    int src, dest;
//
//    Edge(int a, int b) {
//        src = a;
//        dest = b;
//    }
//}
//
//class Graph {
//
//    Vertex vertex[];
//    int nvertex = 0;
//    ArrayList<ArrayList<Integer>> arr;
//    Stack<Integer> stack = new Stack<Integer>();
//    Stack<Integer> cycle = new Stack<Integer>();
//    boolean onStack[];
//    int parent[];
//
//    Graph(int a) {
//
//        onStack = new boolean[a];
//        parent = new int[a];
//        vertex = new Vertex[a];
//        arr = new ArrayList<ArrayList<Integer>>();
//
//        for (int i = 0; i < a; i++) {
//            arr.add(new ArrayList<Integer>());
//        }
//    }
//
//    void addVertex(int a) {
//        vertex[nvertex++] = new Vertex(a);
//    }
//
//    void addEdge(int a, int b) {
//        arr.get(a).add(b);
//    }
//
//    void dfs(int a) {
//
//        vertex[a].visited = true;
//        onStack[a] = true;
//        stack.push(a);
//
//        while (!stack.isEmpty()) {
//
//            int v = adjacentVertex(stack.peek());
//
//            if(v==-2)
//                return;
//            if (v == -1) {
//                onStack[stack.pop()] = false;
//            } else {
//                System.out.println(v);
//                stack.push(v);
//                vertex[v].visited = true;
//                onStack[v] = true;
//            }
//        }
//    }
//
//    int adjacentVertex(int a) {
//
//        for (int w : arr.get(a)) {
//
//            if (!cycle.isEmpty()) {
//                return -2;
//            }            
//            if (vertex[w].visited == false) {
//                parent[w] = a;
//                return w;
//            } else if (onStack[w] == true) {
//
//                for (int x = a; x != w; x = parent[x]) {
//                    cycle.push(x);
//                }
//                cycle.push(w);
//                cycle.push(a);
//            }
//        }
//        return -1;
//    }
//}
