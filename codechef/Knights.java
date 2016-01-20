import java.io.*;

class Knights
{
	public static void main(String[] args)throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);

		int t=Integer.parseInt(br.readLine());
		int d,a;
		while(t-->0)
		{
			String[] s=br.readLine().split(" ");
			int n=Integer.parseInt(s[0]);
			int m=Integer.parseInt(s[1]);

			d=n/2;
			if(m <= n/2)
			{
				a=m+d;
				pw.println(a);
			}
			else
			{
				a=m-d;
				pw.println(a);
			}
		}
		pw.close();
	}
}