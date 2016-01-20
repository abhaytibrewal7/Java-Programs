import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
class PermutationCycle
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int i,d,j,k;
		int b[]=new int[a+1];
		int c[]=new int[a+1];
		int e[]=new int[a+1];
		int f[]=new int[a+1];
		String[] input=br.readLine().split(" ");		
		for(i=1;i<=a;i++)
		{
			b[i]=Integer.parseInt(input[i-1]);
		}
		d=0;	
		for(i=1;i<=a;i++)
		{
		    if(c[i]!=1)
		    {
			if(b[i]==i)
			{
				d++;
				c[i]=1;

			}
			else
			{	
			    j=i;
				while(true)
				{
					c[j]=1;
					j=b[j];
					if(c[j]==1)
					{
						d++;
						break;
					}
				}
			}
		    }
		}
		System.out.println(d);
		for(i=1;i<=a;i++)
		{
		    if(f[i]!=1)
		    {
			if(b[i]==i)
			{
				//d++;
				f[i]=1;
				System.out.println(i+" "+i);

			}
			else
			{	
			   	j=i;
				k=0;
				while(true)
				{
					f[j]=1;
					e[k]=b[j];
					j=b[j];
					k++;
					if(f[j]==1)
					{
						d++;
						break;
					}
				}
				System.out.print(e[k-1]);
				for(j=0;j<k;j++)
					System.out.print(" "+e[j]);
				System.out.println();	
				
			}
		    }
		}
	}
}