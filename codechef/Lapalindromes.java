import java.io.*;

class Lapalindromes
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		
		int l,i,j,k,flag;
		String s;
		int b[];
		int c[];
		for(i=0;i<a;i++)
		{
			s=br.readLine();
			l=s.length();
			b=new int[l];
			c=new int[l];
			if(l%2==0)
			{
				for(j=0;j<l/2;j++)
				{
					for(k=l/2;k<l;k++)
					{
						if(s.charAt(j)==s.charAt(k) && b[k]!=1 && c[j]!=1)
						{
						   b[k]=1;
						   c[j]=1;
						}
					}
				}
				flag=0;
				for(j=l/2;j<l;j++)
				{
				   // System.out.println(b[j]);
					if(b[j]!=1)
						flag=1;
				}
				if(flag==1)
					System.out.println("NO");
				else
					System.out.println("YES");

			}
			else
			{
				for(j=0;j<l/2;j++)
				{
					for(k=(l/2)+1;k<l;k++)
					{
						if(s.charAt(j)==s.charAt(k) && b[k]!=1 && c[j]!=1)
						{
							b[k]=1;
							c[j]=1;
						}
					}
				}
				flag=0;
				for(j=l/2+1;j<l;j++)
				{
				   // System.out.println(b[j]);
					if(b[j]!=1)
						flag=1;
				}
				if(flag==1)
					System.out.println("NO");
				else
					System.out.println("YES");

			}
		}
	}
}