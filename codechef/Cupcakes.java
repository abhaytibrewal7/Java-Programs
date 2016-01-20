import java.io.*;

class CupCakes
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int i,j,min,a;
		while(t!=0)
		{
			a=Integer.parseInt(br.readLine());
			
			min=999999999;
			for(i=1;i<=a;i++)
			{
				for(j=1;j<=a;j++)
				{
					if(i*j == a)
					{
						if(Math.abs(i-j) < min)
							min=Math.abs(i-j);
					}
				}
			}
			System.out.println(min);
			t--;
		}
	}
}