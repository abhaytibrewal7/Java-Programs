//package GraphsEverything;
//
//import java.util.ArrayList;
//import java.util.PriorityQueue;
//
//public class PrimMinimumSpanningTree {
//    public static void main(String[] args) {
//        
//        Graph G=new Graph(6);
//        
//        for(int i=0;i<6;i++)
//            G.addVertex(i);
//        
//        G.addEdge(0, 1, 10);
//        G.addEdge(0, 2, 5);
//        G.addEdge(2, 3, 10);
//        G.addEdge(3, 4, 6);
//        G.addEdge(0, 5, 8);
//        G.addEdge(5, 4, 2);
//        G.addEdge(2, 4, 3);
//        G.addEdge(1, 3, 20);
//        G.addEdge(1, 2, 3);
//        
//        
//        G.prim();
//        
//        for(int i=0;i<6;i++){
//            if(G.vertex[i].previous!=null){
//                System.out.println(G.vertex[i].value+" "+G.vertex[i].previous.value+" "+G.vertex[i].key);
//            }
//        }
//        System.out.println(G.totalWt);
//    }
//}
//
//class Vertex implements Comparable<Vertex>{
//    int value;
//    int key;
//    Vertex previous;
//    
//    Vertex(int a){
//        value=a;
//        key=Integer.MAX_VALUE;
//    }
//    
//    public int compareTo(Vertex a){
//        return key-a.key;
//    }
//}
//
//class Edge{
//    
//    int src,dest,wt;
//    Edge(int a,int b,int c){
//        src=a;
//        dest=b;
//        wt=c;        
//    }
//}
//
//class Graph{
//    
//    Vertex vertex[];
//    ArrayList<ArrayList<Edge>> edges=new ArrayList<ArrayList<Edge>>();
//    PriorityQueue<Vertex> pq=new PriorityQueue<Vertex>();
//    int nvertex=0;
//    int totalWt=0;
//    Graph(int a){
//        vertex=new Vertex[a];
//        
//        for(int i=0;i<a;i++)
//            edges.add(new ArrayList<Edge>());
//    }
//    
//    void addVertex(int a){
//        vertex[nvertex++]=new Vertex(a);
//    }
//    
//    void addEdge(int a,int b,int c){
//        Edge e1=new Edge(a,b,c);
//        Edge e2=new Edge(b,a,c);
//        edges.get(a).add(e1);
//        edges.get(b).add(e2);
//    }
//    
//    void prim(){
//        
//        for(int i=0;i<nvertex;i++)
//            pq.add(vertex[i]);
//                
//        Vertex peek=pq.peek();
//        peek.key=0;
//        while(!pq.isEmpty()){
//            Vertex v=pq.poll();
//            totalWt+=v.key;
//            for(Edge e : edges.get(v.value)){
//                
//                if(pq.contains(vertex[e.dest]) && (vertex[e.dest].key > e.wt)){
//                 pq.remove(vertex[e.dest]);
//                 vertex[e.dest].key=e.wt;
//                 vertex[e.dest].previous=v;
//                 pq.add(vertex[e.dest]);
//                }                                        
//            }
//        }
//    }
//}