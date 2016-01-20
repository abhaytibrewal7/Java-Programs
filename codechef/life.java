import java.util.*;
import java.lang.*;

class life
{
	public static void main(String args[])throws java.lang.Exception
	{
		java.io.BufferedReader br=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b[]=new int[10000];
		int i=0;
		while(a!=42 && a>=-99 && a<=99)
		{
			b[i]=a;
			a=Integer.parseInt(br.readLine());
			i++;
		}
		for(int j=0;j<i;j++)
		{
			System.out.println(b[j]);
		}
	}
}
			