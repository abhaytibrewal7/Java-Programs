package codechef;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.Exception;
 
class CoolingPies
{
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i,j,b;
		int c[];
		int d[];
		for(i=0;i<a;i++)
		{
		    b=sc.nextInt();
		    c=new int[b];
		    d=new int[b];
			for(j=0;j<b;j++)
			{
				c[j]=sc.nextInt();
			//	System.out.println(c[j]);
			}
			
			
			for(j=0;j<b;j++)
			{
				d[j]=sc.nextInt();
			}
			Arrays.sort(c);
			Arrays.sort(d);
		/*	for(int m=0;m<b;m++)
			    System.out.print(c[m]);*/
			int e=0,k;
			for(j=0;j<b;j++)
			{
				for(k=0;k<b;k++)
				{
					if(c[j] <= d[k])
					{
						e++;
						d[k]=-1;
						break;
					}
				}
			}
			System.out.println(e);
		}
	}
			
}		
	