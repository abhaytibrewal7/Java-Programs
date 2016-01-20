import java.io.*;
import java.util.*;

class Farmer
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int a,i,j,flag;
		while(t-->0)
		{
			int x=sc.nextInt();
			int y=sc.nextInt();

			a=x+y+1;
			if(a%2==0)
				a=a+1;
			i=a;
			while(true)
			{
				flag=0;
				for(j=2;j<i;j++)
				{
					if(i%j==0)
					{
						flag=1;
						break;
					}
				}
				if(flag==0)
				{
				    i=i-(x+y);
					System.out.println(i);
					break;
				}
				i=i+2;
			}
		}
	}
}
				