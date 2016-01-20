////addEdge ka kaam nhi aya 
//
////just check G.find(x)==G.find(y)------------if equal cycle detected
//
//
//package GraphsEverything;
//
//import java.util.ArrayList;
//
//public class UndirectedCycleDetectionUnionFind {
//
//    public static void main(String[] args) {
//        
//        Graph G=new Graph(8);
//        for(int i=0;i<8;i++)
//            G.addVertex(i);
//        
//        G.union(0, 1);
//        G.union(0, 2);
//        G.union(2, 3);
//        G.union(1, 2);
//        G.union(2, 6);
//       // G.union(6, 7);
//        G.union(4, 5);
//        G.union(3, 7); 
//        
//        int component=8;
//        
//        while(component-->0){
//            
//            for(int i=0;i<8;i++){
//                if(G.vertex[i].parent==component)
//                    System.out.println("Component "+component +" :"+i);
//            }
//            System.out.println();            
//        }
//    }
//}
//
//class Vertex{
//    
//    int parent,rank,value;
//    
//    Vertex(int value){
//        this.parent=value;
//        this.rank=0;
//        this.value=value;
//    }
//}
//
//class Graph{
//    
//    ArrayList<ArrayList<Integer>> arr=new ArrayList<ArrayList<Integer>>();
//    Vertex vertex[];
//    int nvertex=0;
//    Graph(int a){
//        
//        vertex=new Vertex[a];
//        for(int i=0;i<a;i++){
//            arr.add(new ArrayList<Integer>());
//        }
//    }
//    
//    void addVertex(int a){
//        
//        vertex[nvertex++]=new Vertex(a);
//    }
//    
//    void addEdge(int a,int b){
//        
//        arr.get(a).add(b);
//        arr.get(b).add(a);
//    }
//    
//    int find(int a){
//        
//        if(a!=vertex[a].parent){
//            vertex[a].parent=find(vertex[a].parent);
//        }
//        return vertex[a].parent;        
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
//}
