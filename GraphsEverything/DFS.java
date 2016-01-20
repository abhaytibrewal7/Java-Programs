//package GraphsEverything;
//
//
///*
//
//stackSorted me store karte ja rahe...popped valued..
//aand usko reverse karke print....only this much is topological sort
//
//*/
//
//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.ListIterator;
//import java.util.Stack;
//
//class DFS {
//    public static void main(String args[])throws IOException{
//        
//        Graph G=new Graph(6);
//        for(int i=0;i<6;i++){
//            G.addVertex(i);
//        }
//        /*
//        G.addEdge(1, 2);
//        G.addEdge(2, 3);
//        G.addEdge(1, 4);
//        G.addEdge(0, 1);
//        G.addEdge(4, 2);
//        G.addEdge(2, 0);     
//        */
//        
//        G.addEdge(5,0);
//        G.addEdge(5, 2);
//        G.addEdge(2, 3);
//        G.addEdge(3, 1);
//        G.addEdge(4, 1);
//        G.addEdge(4, 0);
//        
//        for(int i=0;i<6;i++)
//        {
//            if(G.vertex[i].visited==false)
//                G.dfs(i);
//        }
//        
//        G.displayTopologicalSort();
//    }
//}
//
//class Vertex{
//    
//    int a;
//    boolean visited;
//    
//    Vertex(int v){
//        a=v;
//        visited=false;
//    }    
//}
//class Graph{
//    
//    ArrayList<ArrayList<Integer>> adg;
//    Vertex vertex[];
//    int nvertex=0;
//    Stack<Integer> stackSort=new Stack<Integer>();
//    
//    Graph(int v){
//        vertex=new Vertex[v];
//        adg=new ArrayList<ArrayList<Integer>>();
//        for(int i=0;i<v;i++)
//            adg.add(new ArrayList<Integer>());
//    }
//    public void addEdge(int a, int b){
//        
//        adg.get(a).add(b);
//    }
//    
//    public void addVertex(int a){
//        vertex[nvertex++]=new Vertex(a);
//    }   
//    
//    
//    public void dfs(int s){
//        
//        Stack<Integer> stack=new Stack<Integer>();
//        stack.push(s);
//        vertex[s].visited=true;
//        while(!stack.isEmpty()){
//            int v=adjacent(stack.peek());
//            
//            if(v==-1){
//                stackSort.push(stack.peek());
//                System.out.println("poped :"+stack.pop());                
//            }
//            else{
//                System.out.println("pushed :"+stack.push(v));
//                vertex[v].visited=true;
//            }
//        }
//    }
//    
//    public int adjacent(int v){
//        
//        ListIterator<Integer> it=(adg.get(v)).listIterator();
//        
//        while(it.hasNext()){
//            int w=it.next();
//            if(vertex[w].visited==false)
//                return w;
//        }
//        return -1;
//    }
//    
//    public void displayTopologicalSort(){
//       
//        Collections.reverse(stackSort);
//        for(Integer v: stackSort)
//            System.out.print(v+" ");
//
//    }
//}
