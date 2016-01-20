//package GraphsEverything;
//
//import java.util.ArrayList;
//
//public class BellmanFord {
//    public static void main(String[] args) {
//        Graph G=new Graph(7);
//        
//        for(int i=0;i<7;i++)
//            G.addVertex(i);
//        
//        G.addEdge(0, 1, 2);
//        G.addEdge(0, 4, 9);
//        G.addEdge(0, 5, 1);
//        G.addEdge(5, 6, 6);
//        G.addEdge(1, 3, 10);
//        G.addEdge(1, 2, 8);
//        G.addEdge(3, 4, 1);
//        G.addEdge(3, 6, 3);
//        G.addEdge(4, 2, 4);
//        G.addEdge(2, 0, -11);
//        G.addEdge(6, 4, 1);
//        
//        boolean negativeCycle=G.bellmanFord(0);
//        
//        if(negativeCycle==false){
//            G.display(0, 1);
//            G.display(0, 2);
//            G.display(0, 3);
//            G.display(0, 4);
//            G.display(0, 5);
//            G.display(0, 6);            
//        }
//        else
//            System.out.println("Negative Weight Cycle");
//    }
//}
//
//class Vertex{
//    int value;
//    int key;
//    Vertex previous;
//    
//    Vertex(int a){
//        value=a;
//        key=Integer.MAX_VALUE;
//    }        
//}
//
//class Edge{
//    int src,dest,wt;
//    
//    Edge(int a,int b,int c){
//        src=a;
//        dest=b;
//        wt=c;
//    }
//}
//
//class Graph{
//    
//    ArrayList<Edge> edges=new ArrayList<Edge>();
//    int nvertex;
//    Vertex vertex[];
//    Graph(int a){
//        vertex=new Vertex[a];             
//    }
//    
//    void addVertex(int a){
//        vertex[nvertex++]=new Vertex(a);
//    }
//    
//    void addEdge(int a,int b,int c){
//        Edge e=new Edge(a,b,c);
//        
//        edges.add(e);
//    }
//    
//    boolean bellmanFord(int source){
//        
//        boolean negativeCycle=false;
//        vertex[source].key=0;
//        
//        for(int i=0;i<nvertex-1;i++){            
//            for(Edge e : edges){                
//                if(vertex[e.src].key + e.wt < vertex[e.dest].key){
//                    vertex[e.dest].key = vertex[e.src].key + e.wt;
//                    vertex[e.dest].previous = vertex[e.src];
//                }
//            }
//        }
//        
//        for(Edge e : edges){
//            if(vertex[e.src].key + e.wt < vertex[e.dest].key){
//                negativeCycle=true;
//                break;
//            }
//        }
//        
//        return negativeCycle;
//    }
//    
//    void display(int source,int dest){
//        
//        System.out.print(vertex[dest].value + "<--");
//        Vertex v=vertex[dest];
//        while(v.previous !=null && v.previous!=vertex[source]){
//            
//            v=v.previous;
//            System.out.print(v.value + "<--");
//        }
//        System.out.print(vertex[source].value);
//        System.out.println("   Min Dist: "+vertex[dest].key);
//    }
//}
