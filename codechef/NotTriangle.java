import java.io.*;
import java.util.*;

class NotTriangle
{
	public static void main(String args[])throws IOException
	{
		Scanner in=new Scanner(System.in);
		int i,c,j,k;
		while(true){
		    
		int t=in.nextInt();
		if(t==0)
		    break;
		int a[]=new int[t];
		for(i=0;i<t;i++)
			a[i]=in.nextInt();
		Arrays.sort(a);
		c=0;
		for(i=t-1;i>=2;i--)
		{ 
		    j=i-1;
		    k=0;
		    while(k<j){ 
			if(a[k]+a[j] < a[i])
			{
				c=c+j-k;
				k++;
			}
			else
			    j--;
		    }
		}

		System.out.println(c);
		}
	}
}
			
		