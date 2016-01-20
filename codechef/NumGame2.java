import java.io.*;


class NumGame2
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int i,j,n;		
		for(i=0;i<t;i++)
		{
			n=Integer.parseInt(br.readLine());
			if(n%2==0)
			{
				System.out.println("BOB");
			}
			else
			{
				System.out.println("ALICE");
			}
		}
	}
}
					