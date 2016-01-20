import java.io.*;


class DivideCake
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);

		int t=Integer.parseInt(br.readLine());
		int s;
		while(t-->0)
		{
			int n=Integer.parseInt(br.readLine());
			
			if(360%n==0)
				pw.print("y ");
			else
				pw.print("n ");
			if(n<=360)
				pw.print("y ");
			else
				pw.print("n ");
			s=n*(n+1)/2;
			if(s<=360)
				pw.print("y ");
			else
				pw.print("n ");
			pw.println();
		}
		pw.close();
	}
}