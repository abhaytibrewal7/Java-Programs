
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
class Lecandy
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int c,d,i,j;
		int b[];
		for(i=0;i<a;i++)
		{
			String input[]=br.readLine().split(" ");
			c=Integer.parseInt(input[0]);
			d=Integer.parseInt(input[1]);
			b=new int[c];
			String[] input1=br.readLine().split(" ");
			for(j=0;j<c;j++)
				b[j]=Integer.parseInt(input1[j]);
			
			Arrays.sort(b);

			int k=0;
			for(j=0;j<c;j++)
			{
				if(d-b[j] >= 0)
				{
					d=d-b[j];
					k++;
				}
			}
			if(k==c)	
				System.out.println("Yes");
			else
				System.out.println("No");
		}
	}
}
		
