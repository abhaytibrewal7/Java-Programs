import  java.io.*;
import java.util.*;


class CHEFLAPT
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
			
		int c[];
		int n,i,k;
		while(t!=0)
		{
			n=Integer.parseInt(br.readLine());
			String[] input=br.readLine().split(" ");
			c=new int[n];
			for(k=0;k<n;k++)
			{
				c[k]=Integer.parseInt(input[k]);
			}
			Arrays.sort(c);
	       /* for(k=0;k<n;k++)
	            System.out.print(c[k]);*/
			for(k=0;k<=n-1;k++)
			{
				if((k==0) && (c[k]!=c[k+1]))
			    	{
				    	System.out.println(c[k]);
					    break;
				    }
				else if(k==n-1 && c[k] != c[k-1])   
				{
				    	System.out.println(c[k]);
					    break;
				}
				else if((c[k]!=c[k+1]) && (c[k] != c[k-1]))
				{
					System.out.println(c[k]);
					break;
				}
			}
			t--;
		}
	}
}