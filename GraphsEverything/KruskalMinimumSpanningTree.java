//package GraphsEverything;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Iterator;
//
//public class KruskalMinimumSpanningTree {
//    public static void main(String[] args) {
//        Graph G=new Graph(6);
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
//        ArrayList<Edge> sorted=new ArrayList<Edge>();      
//        for(ArrayList<Edge> arr : G.edges)
//            sorted.addAll(arr);
//         
//        G.sort(sorted);
//        
//        for(Edge e : sorted)
//            System.out.println(e.src+" "+e.dest+" "+e.wt+"  ");        
//        
//        System.out.println("");
//        
//        G.kruskal(sorted);
//       
//        G.display();
//    }
//}
//
//class Vertex{
//    int value;
//    int parent,rank;
//    Vertex(int a){
//        value=a;
//        rank=0;
//        parent=a;
//    }
//}
//
//class Edge {
//    int src,dest,wt;
//    Edge(int a,int b,int c){
//        src=a;
//        dest=b;
//        wt=c;                
//    }    
//
//}
//
//class Graph {
//    Vertex vertex[];    
//    int nvertex=0;
//    ArrayList<ArrayList<Edge>> edges=new ArrayList<ArrayList<Edge>>();
//    ArrayList<Edge> mst =new ArrayList<Edge>();  
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
//        Edge edge=new Edge(a,b,c);
//        edges.get(a).add(edge);        
//    }
//    
//    int find(int x){
//        if(x!=vertex[x].parent)
//            vertex[x].parent=find(vertex[x].parent);
//        return vertex[x].parent;
//        
//    }
//    
//    void union(int a,int b){
//        
//        int x=find(a);
//        int y=find(b);
//        
//        if(x==y){                                    //Cycle detection yahi ho rha
//            System.out.println("Cycle");
//            return;
//        }
//            
//        
//        if(vertex[x].rank > vertex[y].rank)
//            vertex[y].parent=x;
//        else if(vertex[y].rank > vertex[x].rank)
//            vertex[x].parent=y;
//        else{
//            vertex[y].parent=x;
//            vertex[x].rank++;
//        }
//    }
//    void sort(ArrayList<Edge> arr){
//        
//        Collections.sort(arr,new Comparator<Edge>(){
//            
//            public int compare(Edge e1,Edge e2){
//                return e1.wt-e2.wt;
//            }            
//        });
//    }
//    
//    void kruskal(ArrayList<Edge> sortededges){        
//            int E=0,i=0;
//            while (E < nvertex-1){
//            int x=find(sortededges.get(i).src);
//            int y=find(sortededges.get(i).dest);
//            
//            if(x!=y){
//                union(sortededges.get(i).src, sortededges.get(i).dest);
//                E++;
//                mst.add(sortededges.get(i)); 
//            }
//            i++;
//        }
//    }
//              
//    void display(){
//        
//        for(int i=0;i<mst.size();i++){
//            System.out.println(mst.get(i).src+" "+mst.get(i).dest+" "+mst.get(i).wt);
//        }
//    }
//}