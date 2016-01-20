package NetworkingPrograms;

import java.util.Scanner;
class day10_1
{
public static void main(String args[])
{/* 
Scanner sc=new Scanner(System.in);
int m,g[],n,d[],z[],r[],msb,i,j,k;
System.out.print("Enter no. of data bits : ");
n=sc.nextInt();
System.out.print("Enter no. of generator bits : ");
m=sc.nextInt();
d=new int[n+m];
g=new int[m];
System.out.print("Enter data bits : ");
for(i=0;i<n;i++)
d[i]=sc.nextInt();
System.out.print("Enter generator bits : ");
for(j=0;j<m;j++)
g[j]=sc.nextInt();
for(i=0;i<m-1;i++)
d[n+i]=0;
r=new int[m+n];
for(i=0;i<m;i++)
r[i]=d[i];
z=new int[m];
for(i=0;i<m;i++)
z[i]=0;                              /////z la sara elements 0 h
                                     ////// d me data h   r me copy of data   g me genrator bits
for(i=0;i<n;i++)                     ///// m me no of genrator bits n ne  data bits 
{ 
k=0;
msb=r[i];
for(j=i;j<m+i;j++)
{ 
if(msb==0) 
r[j]=xor(r[j],z[k]);
else  
r[j]=xor(r[j],g[k]);
k++;
}
r[m+i]=d[m+i];
}
System.out.print("The code bits added are : ");
for(i=n;i<n+m-1;i++)
{ 
d[i]=r[i];
System.out.print(d[i]);
}
System.out.print("\nThe code data is : ");
for(i=0;i<n+m-1;i++)
{ 
System.out.print(d[i]); 
}
}
public static int xor(int x,int y)
{ 
if(x==y) 
return(0);
else  
return(1);*/
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    Scanner sc=new Scanner(System.in);
    
    int n=4;
    int m=4;
    int g[]=new int[m];
    int d[]=new int[n+m];
    System.out.println("Enter generaator bits");
    for(int i=0;i<m;i++){
        g[i]=sc.nextInt();
    }
    System.out.println("Enter data bits");
    for(int i=0;i<n;i++){
        d[i]=sc.nextInt();
    } 
    for(int i=n;i<n+m-1;i++){
        d[i]=0;
    }
    int r[]=new int[n+m];
    for(int i=0;i<m;i++){
        r[i]=d[i];
    }
    int z[]=new int[m];
    for(int i=0;i<m;i++){
        z[i]=0;
    }
    System.out.print("Hello");
    int msb;
    for(int i=0;i<n;i++){
        msb=r[i];
        int k=0;
        for(int j=i;j<m+i;j++){
            if(msb==0){
                r[j]=xor(r[j],z[k]);
            }
            else
                r[j]=xor(r[j],g[k]);
            k++;
        }
        //r[m+i]=d[m+i];
    }
    
    System.out.println("Code bits are:");
    for(int i=n;i<n+m-1;i++){
        d[i]=r[i];
        System.out.print(r[i]);
    }
    System.out.println("\nCode data is");
    for(int i=0;i<n+m-1;i++){
        System.out.print(d[i]);
    }
    
}
    static int xor(int a,int b){
        if(a==b)
            return 0;
        else 
            return 1;
    }
}
