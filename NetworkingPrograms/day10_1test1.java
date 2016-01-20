package NetworkingPrograms;


import java.util.*;

public class day10_1test1 {
    public static void main(String args[])throws Exception{
        Scanner sc=new Scanner(System.in);
        
        int n=4,m=4,i;
        int d[]=new int[n+m];
        int g[]=new int[m];
        int z[]=new int[m];
        int r[]=new int[n+m];
        
        System.out.println("Enter generator bits");
        for(i=0;i<m;i++)
            g[i]=sc.nextInt();
        System.out.println("Enter data bits");
        for(i=0;i<m;i++)
            d[i]=sc.nextInt();
        for(i=0;i<m;i++)
            r[i]=d[i];
        
        for(i=0;i<m;i++){
            int k=0;
            int msb=r[i];
            
            for(int j=i;j<m+i;j++){
                if(msb==0)
                    r[j]=xor(r[j],z[k]);
                else
                    r[j]=xor(r[j],g[k]);
                k++;
            }
            r[m+i]=d[m+i];
        }
        
        System.out.println("\nCode data:");
        for(i=n;i<n+m-1;i++)
        {
            d[i]=r[i];
            System.out.print(d[i]);
        }
        
        System.out.println("\nCode word is:");
        for(i=0;i<n+m-1;i++)
            System.out.print(d[i]);        
    }
    public static int xor(int a,int b){
        if(a==b)
            return 0;
        else 
            return 1;
    }
}
