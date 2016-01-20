import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.Arrays;
 
class CutRecipe
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b,j,flag,k=0,l;
		int min=1001;
		int c[];
		int e[]=new int[1000];	
		for(int i=0;i<a;i++)
		{
			String[] input=br.readLine().split(" ");
			b=Integer.parseInt(input[0]);
			c=new int[b];
			flag=0;
			for(j=0;j<b;j++)
			{
				c[j]=Integer.parseInt(input[j+1]);
			}
			min=1001;
			for(j=0;j<b;j++)
			{
				if(c[j] < min)
					min=c[j];
			}
			if(min==1)
			{
				for(j=0;j<b;j++)
					System.out.print(c[j]+ " ");
				flag=1;
			}
			else{	
			for(j=min;j>=2;j--)
			{
				l=0;
				k=0;
				while(c[k] % j==0)
				{
					e[l]=c[k]/j;
					l++;
					k++;
					if(k >=b)
						break;
				}
				if(l==b)
				{
					for(k=0;k<b;k++)
						System.out.print(e[k] + " ");
					flag=1;
					break;
				}
			}
			}
				
			if(flag==0)
			{
		    		for(k=0;k<b;k++)
				    System.out.print(c[k] + " " );
			}
			System.out.println();
		}
	}					
}