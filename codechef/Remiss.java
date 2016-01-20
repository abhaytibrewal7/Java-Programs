import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
class Remiss
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int i,s;
		int b[]=new int[2];
		for(i=0;i<a;i++)
		{
			String[] input=br.readLine().split(" ");		
			b[0]=Integer.parseInt(input[0]);
			b[1]=Integer.parseInt(input[1]);
			s=b[0]+b[1];
			if(b[0] < b[1])
				System.out.println(b[1]+" "+s);
			else
				System.out.println(b[0]+" "+s);

		}
	}
}
