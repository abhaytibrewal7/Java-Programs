import java.io.*;
//import java.util.*;

class Axis
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		long t=Long.parseLong(br.readLine());
		long s;
		while(t-->0)
		{
			Long n=Long.parseLong(br.readLine());

			s=n+(n*(n+1))/2;
			System.out.println(s);
		}
	}
}