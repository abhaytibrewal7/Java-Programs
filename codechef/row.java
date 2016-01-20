import java.io.*;
import java.util.*;

class Row
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String[] s=br.readLine().split(" ");
		int n=Integer.parseInt(s[0]);
		int t=Integer.parseInt(s[1]);
		int i,a;

		int r[]=new int[n];
		int c[]=new int[n];
		while(t-->0)
		{
			String[] s1=br.readLine().split(" ");
			i=Integer.parseInt(s1[1]);
			a=Integer.parseInt(s1[2]);
			if(s1[0].contains("RowAdd"))
				r[i-1]=r[i-1]+a;
			else
				c[i-1]=c[i-1]+a;
		}
		Arrays.sort(r);
		Arrays.sort(c);
		System.out.println(r[n-1]+c[n-1]);
	}
}
			