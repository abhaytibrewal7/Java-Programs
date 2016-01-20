package ImportantProblems;

import java.io.*;

class LongestSubsequence {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        int arr[]={10,22,9,33,50,60,21,41,48,57};
        lis(arr);
    }
    public static void lis(int a[])
    {
        int m[]=new int[a.length];
        int n=a.length;
        for(int i=0;i<n;i++){
            m[i]=1;
        }
        int res[] = null;
        for(int i=1;i<n;i++)
        {
            int k=0;
            res=new int[n];
            for(int j=0;j<i;j++)
            {
                if(a[i] > a[j] && m[i]<=m[j]){                    
                    res[k]=a[j];
                    m[i]++;  
                    k++;
                }
            }
            
        }
        int max=Integer.MAX_VALUE;
        int pos=0;
        for(int i=0;i<n;i++)
        {
            if(m[i] < max){                            
                max=m[i];
                pos=i;
            }
        }
        res[max-1]=a[pos];
        System.out.println("max  "+max);
        for(int i=0;i<max;i++)
                System.out.println("final  "+res[i]);
    }
}


