import java.io.*;
import java.util.*;

class Ambiguous
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));


		int n=Integer.parseInt(br.readLine());
		int i;
		int a[];
		int b[];
		while(n!=0)
		{
			String[] s=br.readLine().split(" ");
			a=new int[n+1];
			b=new int[n+1];
			for(i=1;i<=n;i++)
			{
				a[i]=Integer.parseInt(s[i-1]);
				b[a[i]]=i;
			}
			for(i=1;i<=n;i++)
			{
				if(a[i]!=b[i])
					break;
			}
			if(i==n+1)
				System.out.println("ambiguous");
			else
				System.out.println("not ambiguous");
			n=Integer.parseInt(br.readLine());
		}
	}
}
			