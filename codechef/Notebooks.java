package codechef;
import java.io.*;

class Notebooks
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int p[];
		int c[];
		int i,j,x,y,k,n,w,flag;
		
		while(t!=0)
		{
			String[] input=br.readLine().split(" ");
			
			x=Integer.parseInt(input[0]);
			y=Integer.parseInt(input[1]);
			k=Integer.parseInt(input[2]);
			n=Integer.parseInt(input[3]);
			w=x-y;
			p=new int[n];
			c=new int[n];
			String[] input1;
			for(i=0;i<n;i++)
			{
				input1=br.readLine().split(" ");
				p[i]=Integer.parseInt(input1[0]);
				c[i]=Integer.parseInt(input1[1]);
			}
			flag=0;
			for(i=0;i<n;i++)
			{
				if(c[i] >= k && p[i] >= w)
					flag=1;
			}
			if(flag==1)
				System.out.println("LuckyChef");
			else
				System.out.println("UnluckyChef");
			t--;
		}
	}
}
					