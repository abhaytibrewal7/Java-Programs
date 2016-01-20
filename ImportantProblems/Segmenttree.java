package ImportantProblems;

import java.io.*;
import java.util.*;

class Segmenttree {
    
    
    public static void main(String[] args) throws IOException{
         BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int n=Integer.parseInt(br.readLine());
        String s[]=br.readLine().split(" ");           
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=Integer.parseInt(s[i]);
        
        String s1[]=br.readLine().split(" ");
        int m=Integer.parseInt(s1[0]);
        int x=Integer.parseInt(s1[1]);
        int y=Integer.parseInt(s1[2]);

        //int l=(int)(Math.ceil(Math.log(n)))+1;
        //int size=2*(int)(Math.pow(2, l));

        //System.out.println(l+"  "+size);
        int tree[]=new int[100000000];
    
        Segmenttree obj=new Segmenttree();
        obj.buildtree(1,0,n-1,arr,tree);
        
        int max1,min1,sum=0;
        //for(int i=0;i<=size;i++)
          //  System.out.println(tree[i]);
       // int z=1;
         while(m-->0)
        {                               
            max1=Math.max(x,y);
            min1=Math.min(x,y);    
            int k=obj.query(1,0,n-1,min1,max1,tree);
            sum=sum+k;
            
           // z++;
            x=(x+7)%(n-1);
            y=(y+11)%n;
   
        }
         System.out.println(sum);
    }
    public void buildtree(int node,int a,int b,int arr[],int tree[])
    {         
        if(a>b)
            return;
        if(a==b){
            tree[node]=arr[a];
            
            return;
        }
        buildtree(node*2,a,(a+b)/2,arr,tree);
        buildtree(node*2+1,(a+b)/2 +1,b,arr,tree);
        
        tree[node]=Math.max(tree[node*2], tree[(node*2) +1]);
        
    }
    public int query(int node,int a,int b,int i,int j,int tree[])
    {
                
        if(a>b || a>j || b<i){                    
            return Integer.MIN_VALUE;
        }
        if(a>=i && b<=j)
            return tree[node];
       
        int q1=query(node*2,a,(a+b)/2,i,j,tree);
        int q2=query(1+node*2,1+(a+b)/2,b,i,j,tree);
   
        int res=Math.max(q1, q2);
        
        return res;
    }
    
}
