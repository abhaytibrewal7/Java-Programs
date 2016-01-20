package codechef;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
//import java.util.Arrays;
 
class ThreeWayComm
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int i,n,j,c;
		double d[]=new double[3];
		int ax[]=new int[2];
		int bx[]=new int[2];
		int cx[]=new int[2];
		for(i=0;i<a;i++)
		{
			n=Integer.parseInt(br.readLine());
			String[] input=br.readLine().split(" ");
			ax[0]=Integer.parseInt(input[0]);
			ax[1]=Integer.parseInt(input[1]);
			String[] input1=br.readLine().split(" ");
			bx[0]=Integer.parseInt(input1[0]);
			bx[1]=Integer.parseInt(input1[1]);
			String[] input2=br.readLine().split(" ");
			cx[0]=Integer.parseInt(input2[0]);
			cx[1]=Integer.parseInt(input2[1]);
		
			d[0]=Math.sqrt(Math.pow((ax[0]-bx[0]),2) + Math.pow((ax[1]-bx[1]),2));
			d[1]=Math.sqrt(Math.pow((bx[0]-cx[0]),2) + Math.pow((bx[1]-cx[1]),2));
			d[2]=Math.sqrt(Math.pow((ax[0]-cx[0]),2) + Math.pow((ax[1]-cx[1]),2));
 
			c=0;
			for(j=0;j<3;j++)
			{
				if(d[j] <= n)
					c++;
			}
			if(c>=2)
				System.out.println("yes");
			else
				System.out.println("no");
		}
	}
}
