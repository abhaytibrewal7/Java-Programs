import java.io.*;

class AtticCrossing
{
	public static void main(String args[])throws IOException
	{	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int i,c,max=0,l;
		while(t-->0)
		{
			String s=br.readLine();
			l=0;
			max=0;
			for(i=0;i<s.length();i++)
			{
				c=0;
				while(s.charAt(i)== '.')
				{
					c++;
					i++;
				}
				//System.out.print(i);
				if(c > max)
				{
				    l++;
					max=c;
				}
			}
			System.out.println(l);
		}
	}
}