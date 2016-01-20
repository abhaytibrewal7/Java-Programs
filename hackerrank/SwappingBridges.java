////solved
//
//package hackerrank;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.Stack;
//
//public class SwappingBridges {
//    public static void main(String[] args) throws IOException{
//        
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        PrintWriter pw = new PrintWriter(System.out);
//        
//        int t=Integer.parseInt(br.readLine());
//        while(t-->0){           
//            int n=Integer.parseInt(br.readLine());
//            Graph G = new Graph(n+1);
//            String s[]=br.readLine().split(" ");
//            for(int i=1;i<=n;i++){
//                G.addVertex(i);
//                G.addEdge(i, Integer.parseInt(s[i-1]));
//            }
//            int component=0;
//            for(int i=1;i<=n;i++){
//                if(G.vertex[i].visited == false){
//                    component++;
//                    G.dfs(i);
//                }                    
//            }
//            
//            pw.println(component-1);
//        }       
//        pw.close();
//    }
//}
//
//class Vertex{
//    boolean visited;
//    int a;
//    Vertex(int b){
//        a=b;
//        visited=false;
//    }
//}
//class Graph{
//    ArrayList<ArrayList<Integer>> adg;
//    Vertex vertex[];
//    int nvertex=1;
//    
//    Graph(int v){
//        vertex=new Vertex[v];
//        adg=new ArrayList<ArrayList<Integer>>();
//        for(int i=0;i<v;i++)
//            adg.add(new ArrayList<Integer>());
//    }
//    public final void addVertex(int a){
//        vertex[nvertex++]=new Vertex(a);
//    }
//    
//    public final void addEdge(int a,int b){
//        adg.get(a).add(b);
//    }
//    
//    public final void dfs(int s){
//        
//        Stack<Integer> stack = new Stack<Integer>();
//        vertex[s].visited=true;
//        stack.push(s);
//        
//        while(!stack.isEmpty()){
//            int v=adjacent(stack.peek());
//            
//            if(v==-1)
//                stack.pop();
//            else{
//                stack.push(v);
//                vertex[v].visited=true;
//            }                
//        }
//    }
//    
//    public final int adjacent(int a){
//        
//        Iterator<Integer> i=adg.get(a).iterator();
//        while(i.hasNext()){
//            int w=i.next();
//            if(vertex[w].visited==false)
//                return w;
//        }
//        return -1;
//    }
//}