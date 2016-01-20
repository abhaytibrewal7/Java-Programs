import java.io.*;

class ChefDivisibility
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		
		int c,i;
		String[] input=br.readLine().split(" ");
		int n=Integer.parseInt(input[0]);
		int q=Integer.parseInt(input[1]);

		int a[]=new int[n+1];

		String[] input1=br.readLine().split(" ");
		for(i=1;i<=n;i++)
		{
			a[i]=Integer.parseInt(input1[i-1]);
		}
		while(q!=0)
		{
			String[] input2=br.readLine().split(" ");
			int l=Integer.parseInt(input2[0]);
			int r=Integer.parseInt(input2[1]);
			int k=Integer.parseInt(input2[2]);
			c=0;
			for(i=l;i<=r;i++)
			{
				if(a[i]%k==0)
					c++;
			}
			pw.println(c);
			q--;
		}
		pw.close();

	}
}