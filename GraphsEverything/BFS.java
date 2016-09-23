package GraphsEverything;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class BFS {
    public static void main(String args[]){
        
        Graph G=new Graph(5);
        
        for(int i=0;i<5;i++){
              G.addVertex(i);
        }
        G.addEdge(1, 2);
        G.addEdge(2, 3);
        G.addEdge(1, 4);
        G.addEdge(0, 1);
        G.addEdge(4, 2);
        G.addEdge(2, 0);     
      
        G.bfs(1);
    }
}

class Vertex{
    
    int a;
    boolean visited;
    
    Vertex(int v){
        a=v;
        visited=false;                        
    }               
}

class Graph{
    
    Vertex vertex[];
    int nvertex=0;
    ArrayList<ArrayList<Integer>> adg;
    
    Graph(int v){
        
        vertex=new Vertex[v];
        adg=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<v;i++){
            adg.add(new ArrayList<Integer>());
        }        
    }
    
    void addVertex(int v){
        vertex[nvertex++]=new Vertex(v);
    }
    
    void addEdge(int a,int b){
        adg.get(a).add(b);
    }
    
    void bfs(int s){
        
        Queue<Integer> queue=new LinkedList<Integer>();
        vertex[s].visited=true;
        int v;
        queue.add(s);
        while(!queue.isEmpty()){
            
            //System.out.println(queue.peek());
            int w=queue.remove();
            System.out.println("Poppedddd   :"+w);
            while((v=adjacent(w))!=-1){
                System.out.println("Pusheddd   :"+v);
                queue.add(v);
                vertex[v].visited=true;
            }            
        }
    }
    
    int adjacent(int w){
        
        ListIterator<Integer> it=adg.get(w).listIterator();
        
        while(it.hasNext()){
            
            int a=it.next();
            if(vertex[a].visited==false)
                  return a;
        }
        return -1;
    }
}
        
