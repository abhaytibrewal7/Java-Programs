package codechef;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


class PackagingCupcake
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int i,b,t;
		for(i=0;i<a;i++)
		{
			b=Integer.parseInt(br.readLine());
			t=(b/2)+1;
			System.out.println(t);
		}
	}
}
	