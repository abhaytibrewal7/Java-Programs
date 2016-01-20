//package GraphsEverything;
//
//import java.util.ArrayList;
//import java.util.PriorityQueue;
//
//public class DijkstraSSP {
//    public static void main(String[] args) {
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
//        G.Dijkstra(0);
//        
//        G.display(0, 5);
//        G.display(0, 1);
//        G.display(0, 2);
//        G.display(0, 3);
//        G.display(0, 4);        
//    }
//}
//
//
//class Vertex implements Comparable<Vertex>{
//    
//    int value,key;
//    Vertex previous;
//    
//    Vertex(int a){
//        value=a;
//        key=Integer.MAX_VALUE;
//    }
//    
//    public int compareTo(Vertex v){
//        return key-v.key;
//    }
//    
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
//    
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
//        edges.get(a).add(e1);
//        
//        Edge e2=new Edge(b,a,c);
//        edges.get(b).add(e2);
//    }
//    
//    void Dijkstra(int source){
//        
//        for(int i=0;i<nvertex;i++)
//            pq.add(vertex[i]);
//        
//        vertex[source].key=0;
//        
//        while(!pq.isEmpty()){
//            
//            Vertex v=pq.poll();
//            
//            for(Edge e : edges.get(v.value)){
//                
//                if(pq.contains(vertex[e.dest])  && (e.wt + vertex[e.src].key< vertex[e.dest].key)){
//                    pq.remove(vertex[e.dest]);
//                    vertex[e.dest].key=e.wt+vertex[e.src].key;
//                    vertex[e.dest].previous=vertex[e.src];
//                    pq.add(vertex[e.dest]);
//                }
//            }
//        }        
//    }
//    
//    void display(int source,int dest){
//        
//        System.out.print(vertex[dest].value + "<--");
//        Vertex v=vertex[dest];        
//        while(v.previous!=null && v.previous != vertex[source]){
//            v=v.previous;            
//            System.out.print(v.value + "<--");
//        }
//        System.out.print(vertex[source].value);
//        System.out.println("      Minimum Distance:"+vertex[dest].key);
//        
//    }
//}
//        