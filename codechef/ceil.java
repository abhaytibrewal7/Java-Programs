package codechef;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class ceil
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input[]=br.readLine().split(" ");
		int A=Integer.parseInt(input[0]);
		int B=Integer.parseInt(input[1]);
		
		int c=A-B;
		int e;
		e=c%10;
		if(e==9)
			c=c-1;
		else
			c=c+1;
		System.out.println(c);
	}
}