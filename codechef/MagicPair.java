import java.io.*;


class MagicPair
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);

		long t=Long.parseLong(br.readLine());
		long c;
		String s;
		while(t-->0)
		{
			long n=Long.parseLong(br.readLine());
			s=br.readLine();

			c=n*(n-1)/2;
			pw.println(c);

		}
		pw.close();
	}
}		