package codechef;
import java.io.*;
import java.util.*;

class Copy_paste
{
	public static void main(String args[])throws IOException
	{	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int i,c;
		int a[];
		while(t-->0)
		{
			int n=Integer.parseInt(br.readLine());
			a=new int[n];
			String[] input=br.readLine().split(" ");
			for(i=0;i<n;i++)
				a[i]=Integer.parseInt(input[i]);
			
			Arrays.sort(a);
			c=0;
			for(i=0;i<n;i++)
			{
				if(a[i]!=a[i+1])
					c++;
			}
			if(a[n-1]!= a[n-2])
				c++;
			System.out.println(c);
		}
	}
}