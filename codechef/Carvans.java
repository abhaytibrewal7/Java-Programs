import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
class Carvans
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int i,n,j,min=0,c;
		int s[];
		for(i=0;i<a;i++)
		{
			n=Integer.parseInt(br.readLine());
			String[] input=br.readLine().split(" ");
			s=new int[n];
			for(j=0;j<n;j++)
			{
				s[j]=Integer.parseInt(input[j]);
			}
			min=s[0];
			c=1;
			for(j=1;j<n;j++)
			{
				if(s[j] <= min)
				{
					c++;
					min=s[j];
				}
			}
			System.out.println(c);
		}
	}
}
