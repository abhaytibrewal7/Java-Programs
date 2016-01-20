package codechef;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.Arrays;
 
class NuclearR
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String input[]=br.readLine().split(" ");
		int A=Integer.parseInt(input[0]);
		int N=Integer.parseInt(input[1]);
		int K=Integer.parseInt(input[2]);
		int i=0,z;
		int a[]=new int[K];
		while(i<K)
		{
			z=A/(N+1);
			a[i]=A%(N+1);
			A=z;
			i++;
		}
		for(i=0;i<K;i++)
		{
			System.out.print(a[i]+" ");
		}
	}
}
			


			