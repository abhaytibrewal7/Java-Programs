import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
class Snape
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int i;
		double min,max;
		for(i=0;i<a;i++)
		{
			String[] input=br.readLine().split(" ");
			int b=Integer.parseInt(input[0]);
			int ls=Integer.parseInt(input[1]);

			min=Math.sqrt(ls*ls - b*b);
			max=Math.sqrt(ls*ls + b*b);
			
			System.out.println(min+" "+max);
		}
	}
}