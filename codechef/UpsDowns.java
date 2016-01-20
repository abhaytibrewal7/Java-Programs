import java.io.*;
import java.util.Arrays;

class UpsDowns
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int n,i,temp;
		int a[];
		while(t!=0)
		{
			n=Integer.parseInt(br.readLine());
			String[] input=br.readLine().split(" ");
			a=new int[n];
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(input[i]);	
			}
			Arrays.sort(a);
			for(i=0;i<n-1;i++)
			{
				if(i%2 != 0)
				{
					temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			for(i=0;i<n;i++)
			{
				System.out.print(a[i] + " ");
			}
			System.out.println();
			t--;
		}
	}
}
			