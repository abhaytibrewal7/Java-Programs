//
//package GraphsEverything;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.ListIterator;
//import java.util.Stack;
//
//public class UndirectedGraphCycleDetectionDFS {
//    public static void main(String[] args) {
//        
//        Graph G=new Graph(8);
//        for(int i=0;i<8;i++)
//            G.addVertex(i);
//        
//        G.addEdge(0, 1);
//        G.addEdge(0, 3);
//      //  G.addEdge(3, 7);
//        G.addEdge(3, 2);
//        //G.addEdge(0, 3);
//        G.addEdge(2, 4);        
//        G.addEdge(4, 5);
//        G.addEdge(5, 7);
//        G.addEdge(6, 4);
//        G.addEdge(7, 4);
//        
//      //  G.addEdge(7, 6);
//        
//        for(int i=0;i<8;i++)
//            if(G.vertex[i].visited==false){
//                System.out.println(i);            
//                G.dfs(-1, i);
//            }
//          if(!G.cycle.isEmpty()){
//              System.out.println("Cycle");
//            for(int i : G.cycle)
//                System.out.println(i+" ");
//            System.out.println();
//        }
//        else
//            System.out.println("Acyclic");                                        
//    }
//}
//
//class Vertex{
//    
//    int value;
//    boolean visited;
//    
//    Vertex(int a){
//        value=a;
//        visited=false;
//    }
//}
//
//class Edge{
//    
//    int src,dest;
//    Edge(int a,int b){
//        src=a;
//        dest=b;
//    }
//}
//
//class Graph{
//    
//    Vertex vertex[];
//    ArrayList<ArrayList<Integer>> arr;
//    int nvertex=0;
//    Stack<Integer> cycle=new Stack<Integer>();
//    Stack<Integer> stack=new Stack<Integer>();
//    int parent[];
//    Graph(int a){
//        
//        vertex=new Vertex[a];
//        arr=new ArrayList<ArrayList<Integer>>();
//        parent=new int[a];
//        for(int i=0;i<a;i++)
//            arr.add(new ArrayList<Integer>());
//    }
//    
//    void addVertex(int a){
//        vertex[nvertex++]=new Vertex(a);
//    }
//    void addEdge(int a,int b){
//        arr.get(a).add(b);
//        arr.get(b).add(a);
//    }
////
////    Iterable<Integer> cycle(){
////        return cycle;
////    }
// 
////    void dfs(int u,int v){
////        
////        vertex[v].visited=true;
////        stack.push(v);
////        
////        while(!stack.isEmpty()){
////            
////            int a=stack.peek();
////            
////            for(int w : arr.get(a)){
////                
////                if(!cycle.isEmpty())
////                    return;
////                if(vertex[w].visited==false){
////                    stack.push(w);
////                    parent[w]=a;
////                    u=a;
////                    a=w;
////                    System.out.println(w);
////                    vertex[w].visited=true;
////                    
////                }
////                else if(u!=w){
////                    for(int x=a;x!=w;x=parent[x])
////                        cycle.push(x);
////                    cycle.push(w);
////                    cycle.push(a);
////                }
////            }
////            stack.pop();
////        }
////    }
////    
//    void dfs(int u,int v){
//        
//        vertex[v].visited=true;
//        
//        
//        for(int w : arr.get(v)){
//            
//            if(!cycle.isEmpty())
//                return;
//            if(vertex[w].visited==false){
//                parent[w]=v;
//                System.out.println(w);
//                dfs(v,w);
//            }
//            
//            else if(w!=u){    ///checks ki jab repeatition of edges ho rha in undirected (a-> b and b-> a) ..wo condition to nhi
//                                ///that is reverse of edge wala chiz nhi lo    
//               
//                for(int x=v;x!=w;x=parent[x])
//                    cycle.push(x);
//                cycle.push(w);
//                cycle.push(v);
//            }
//        }
//    }
//}