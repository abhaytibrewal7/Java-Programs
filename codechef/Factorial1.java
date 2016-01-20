package codechef;
import java.io.*;
import java.math.*;

class Factorial
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int n,i;	
                
		while(t!=0)
		{
			n=Integer.parseInt(br.readLine());
			BigInteger fac=BigInteger.ONE;
			for(i=2;i<=n;i++)
			{
				fac=fac.multiply(BigInteger.valueOf(i));
			}
			System.out.println(fac);
			t--;
		}
	}
}	 