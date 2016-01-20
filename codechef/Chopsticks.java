import java.io.*;
import java.util.*;

class Chopsticks
{
	public static void main(String args[])throws IOException
	{	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().split(" ");
		int t=Integer.parseInt(input[0]);
		int d=Integer.parseInt(input[1]);
		int a[]=new int[t+1];
		a[t]=Integer.MAX_VALUE;
		int i,c=0;
		for(i=0;i<t;i++)
			a[i]=Integer.parseInt(br.readLine());
		Arrays.sort(a);
		for(i=0;i<t-1;i++)
		{
			if(a[i+1]-a[i] <=d)
			{
				c++;
				i++;
			}
		}
		System.out.println(c);
	}
}
			