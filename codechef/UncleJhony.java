import java.io.*;
import java.util.*;


class UncleJohny
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int i,j,n,k,p;
		int a[];		
		for(i=0;i<t;i++)
		{
			n=Integer.parseInt(br.readLine());
			String[] input=br.readLine().split(" ");
			a=new int[n+1];
			for(j=1;j<=n;j++)
			{
					a[j]=Integer.parseInt(input[j-1]);
			}
			k=Integer.parseInt(br.readLine());

			p=a[k];
			Arrays.sort(a);
			for(j=1;j<=n;j++)
			{
				if(a[j]==p)
					break;
			}
			System.out.println(j);
		}
	}
}
			
			