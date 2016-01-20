
import java.io.*;
import java.util.*;

class SubtractionGame
{

	public static int gcd(int a,int b)
	{
		if(b==0)
			return a;
		return gcd(b,a%b);
	}
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int i,n,k;
		int a[];		
		while(t!=0)
		{
			n=Integer.parseInt(br.readLine());
			String[] input=br.readLine().split(" ");
			a=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(input[i]);
			}

			k=a[0];	
			for(i=0;i<n;i++)
			{
				k=gcd(k,a[i]);
			}
			System.out.println(k);
			t--;
		}
	}
}		