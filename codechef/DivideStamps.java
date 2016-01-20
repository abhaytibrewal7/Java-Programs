import java.io.*;


class DivideStamps
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);

		int t=Integer.parseInt(br.readLine());
		int c=0,s,i;
		int a[]=new int[t];
		String[] input=br.readLine().split(" ");
		for(i=0;i<t;i++)
		{
			a[i]=Integer.parseInt(input[i]);
			c=c+a[i];
		}

		s=t*(t+1)/2;
		if(s==c)
			pw.println("YES");
		else
			pw.println("NO");
			
			pw.close();
	}
}