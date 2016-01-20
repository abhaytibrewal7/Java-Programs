package codechef;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
class CleaningUp
{
	public static void main(String args[])throws IOException
	{	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b,c,j,k;
		int d[];
		int e[];
		int m[];
		for(int i=0;i<a;i++)
		{
			String[] input=br.readLine().split(" ");
			b=Integer.parseInt(input[0]);
			c=Integer.parseInt(input[1]);
			d=new int[c+1];
			e=new int[b+1];
			m=new int[b+1];
			String[] input1=br.readLine().split(" ");
			for(j=1;j<=c;j++)
			{
				d[j]=Integer.parseInt(input1[j-1]);
			}
			Arrays.sort(d);
			for(j=1;j<=b;j++)
			{
			    for(k=1;k<=c;k++)
			    {
			        if(j==d[k])
			        {
					    e[j]=1;
					   // System.out.print(j);
					    break;
			        }
			    }
			}
			k=1;
			for(j=1;j<=b;j++)
			{
			        if(e[j]!=1)
			        {
			             m[k]=j;
			             k++;
			        }
			}
			for(j=1;j<k;j++)
			{
			    if(j%2 != 0)
			        System.out.print(m[j] + " ");
			}
			System.out.println();
			for(j=1;j<k;j++)
			{
			    if(j%2 == 0)
			        System.out.print(m[j] + " ");
			}
			System.out.println();
		}
	}
}