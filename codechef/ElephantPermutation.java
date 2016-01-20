package codechef;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ElephantPermu
{
	public static void main(String args[])throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=Integer.parseInt(br.readLine());
			int j=0,b,k,c,n,lc;
			int a[];
			for(int i=0;i<t;i++)
			{
				n=Integer.parseInt(br.readLine());
				a=new int[n+1];
				String[] input=br.readLine().split(" ");
				for(j=1;j<=n;j++)
					a[j]=Integer.parseInt(input[j--]);
				c=0;
				for(k=1;k<n;k++)
				{
					for(j=k+1;j<=n;j++)
					{
						if(a[k]>a[j])
							c++;
					}
				}
				lc=0;
				for(j=1;j<n;j++)
				{
					if(a[j]>a[j+1])
						lc++;
				}
				if(c==lc)
					System.out.println("YES");
				else
					System.out.println("NO");
			}
		}
}

		
				
					
				