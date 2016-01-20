import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
class CountMax
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b[];
		int c,t=0,j,m,k,i;
		int e[];
		for(i=0;i<a;i++)
		{
			c=Integer.parseInt(br.readLine());
			b=new int[c+1];
			e=new int[c+1];
			b[c]=10001;
			String[] input=br.readLine().split(" ");
			for(j=0;j<c;j++)
				b[j]=Integer.parseInt(input[j]);
			
			Arrays.sort(b);
			for(k=0;k<c;k++)
			{
				m=0;
				while(b[k]==b[k+1]  && k<c)
				{
					k++;
					m++;
				}
				e[k]=m+1;
			}
			int max=0,pos=0;
			for(j=0;j<c;j++)
			{
				if(e[j] > max)
				{
					max=e[j];
					pos=j;
				}
			}
			System.out.println(b[pos]+" "+max);
		}
	}
}		