
//wronggggggggggggggggggggggggggggggggggg

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
class PayingUp
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b,c,j,s;
		int d[];
		for(int i=0;i<a;i++)
		{
			String[] input=br.readLine().split(" ");
			b=Integer.parseInt(input[0]);
			c=Integer.parseInt(input[1]);
			d=new int[b];
			s=0;
			for(j=0;j<b;j++)
			{
				d[j]=Integer.parseInt(br.readLine());
				
				if(s+d[j] < c)
				{
					s=s+d[j];
				}
			}
			if(s==c)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
				
				
				
			
