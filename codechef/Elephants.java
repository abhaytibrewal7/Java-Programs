package codechef;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
class Elephants
{
	public static void main(String args[])throws IOException
	{	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b,c,j,k,m;
		int d[];
		for(int i=0;i<a;i++)
		{
			String[] input=br.readLine().split(" ");
			b=Integer.parseInt(input[0]);
			c=Integer.parseInt(input[1]);
			d=new int[c];
			String[] input1=br.readLine().split(" ");
			for(j=0;j<c;j++)
			{
				d[j]=Integer.parseInt(input1[j-1]);
			}
			Arrays.sort(d);
			m=0;
			for(k=1;k<=b;k++)
			{
				for(j=0;j<c;j++)
				{
					if(d[j] <= k)
						m++;
				}
			}
			if(m==b)
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}	