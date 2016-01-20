import java.io.*;

class LuckyLong
{
	public static void main(String args[])throws IOException
	{	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int i,c;
		while(t-->0)
		{
			String s=br.readLine();
			c=0;
			for(i=0;i<s.length();i++)
			{
				if(s.charAt(i)!='4' && s.charAt(i)!='7')
					c++;
			}
			System.out.println(c);
		}
	}
}