import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
class RacingHorses
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int i,n,j,min=1000000000,d;
		int s[];
		for(i=0;i<a;i++)
		{
			n=Integer.parseInt(br.readLine());
			String[] input=br.readLine().split(" ");
			s=new int[n];
			for(j=0;j<n;j++)
			{
				s[j]=Integer.parseInt(input[j]);
			}
			Arrays.sort(s);
			min=1000000001;
			for(j=0;j<n-1;j++)
			{
				d=Math.abs(s[j]-s[j+1]);
				if(d < min)
					min=d;
			}
			System.out.println(min);
		}
	}
}
