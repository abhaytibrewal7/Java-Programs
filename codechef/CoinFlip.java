import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
class CoinFlip
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int i,j,G,k,h;
		for(i=0;i<a;i++)
		{
			G=Integer.parseInt(br.readLine());
			for(j=0;j<G;j++)
			{
				String[] input=br.readLine().split(" ");
				int I=Integer.parseInt(input[0]);
				int N=Integer.parseInt(input[1]);
				int Q=Integer.parseInt(input[2]);
				if(N%2==0)
					System.out.println(N/2);	
				else
					if(I==1)
					{
						if(Q==1)
							System.out.println(N/2);
						else
						{
							h=N/2+1;
							System.out.println(h);
						}
					}
					else
					{
						if(Q==1)
						{
							h=N/2+1;
							System.out.println(h);
						}
						else
							System.out.println(N/2);
					}
			}
		}
	}
}