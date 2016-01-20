import java.io.*;
import java.math.*;
import java.util.*;

class GCD
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		int t=Integer.parseInt(br.readLine());
	     long a[];
		int c=0,max,i,j;
		BigInteger b1,b2;
		while(t-->0)
		{
			int n=Integer.parseInt(br.readLine());
			a=new long[n];
			String[] s=br.readLine().split(" ");
			for(i=0;i<n;i++)
				a[i]=Long.parseLong(s[i]);
			c=0;
			max=Integer.MIN_VALUE;
			ArrayList<BigInteger> l=new ArrayList<BigInteger>();

		      for(i=0;i<n;i++)
		      {
		         //b2=BigInteger.valueOf(a[i]);
				l.add(new BigInteger(String.valueOf(i)));
		      }
            i=0;
			for(j=1;j<n;j++)
			{
				b1=(l.get(i)).gcd(l.get(j));
				if(b1==(BigInteger.ONE))
					c++;
				else{
					if(c > max)
						max=c;
					c=0;
					i++;
					j=i;
				}
				
			}
			System.out.println(c);
		}
	}
}

				