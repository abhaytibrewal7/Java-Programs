import java.io.*;

class PrimePalin
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		int n=Integer.parseInt(br.readLine());
		int a,b,i,flag=0,j;
		String s;
		if(n%2==0)
			n=n+1;
		i=n;
		while(true)
		{
			b=palin(i);
			if(b==1)
			{
				System.out.println(i);
				flag=1;
				for(j=2;j<i;j++)
				{
					if(i%j==0){
						flag=0;
						break;
					}
				}
				if(flag==1)
				{	
					System.out.println(i);
					break;
				}
			}
			i=i+2;
			/*if(flag==1)
				break;*/

			flag=0;
			
		}
	}
	/*public static int prime(int n)
	{
		int c=0;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
				c++;
		}
		if(c==0)
			return 1;
		else
			return 0;
	}*/
	public static int palin(int n)
	{
		StringBuilder sb=new StringBuilder(n+"");
		String r=sb.reverse().toString();
		if(r.equals(n+""))
			return 1;
		else 
			return 0;
		
	}
}
