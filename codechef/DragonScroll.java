package codechef;

////////////////not done

import java.io.*;
import java.util.*;

class DragonScroll
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int n,i,rem1,rem2,a1,b1;
		int a[];
		int b[];
		int c[];
		while(t!=0)
		{
			String[] input=br.readLine().split(" ");
			n=Integer.parseInt(input[0]);
			a1=Integer.parseInt(input[1]);
			b1=Integer.parseInt(input[2]);
			a=new int[n];
			b=new int[n];
			c=new int[n];
		
			for(i=0;i<n;i++)
			{
				rem1=a1%2;
				rem2=b1%2;
				a[i]=rem1;
				b[i]=rem2;
				a1=a1/2;
				b1=b1/2;
			}
			Arrays.sort(a);
			Arrays.sort(b);
			
			for(i=0;i<n;i++)
			{
				c[i]=a[i]^b[i];
			}
			for(i=0;i<n;i++)
			{
				System.out.println(c[i]);
			}
			
			
			t--;
		}
	}
}
	
			
			
