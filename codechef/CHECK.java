
///////CCHHHHHHHHHHHHHEEEEEEEEEEEEEEEKKKKKKKKKKKKKKK

import java.io.*;

class RightAngle
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[6];
		int b[]=new int[6];
		int i,j,c=0;
		for(i=0;i<n;i++)
		{
			String[] input=br.readLine().split(" ");
			
			for(j=0;j<5;j=j+2)
			{
				a[j]=Integer.parseInt(input[j]);
			}
			for(j=1;j<6;j=j+2)
			{
				b[j]=Integer.parseInt(input[j]);
			}
			if(a[0]==a[2] || a[0]==a[4] || a[2]==a[4])
			{
				if(a[1]==a[3] || a[1]==a[5] || a[3]==a[5])
					c++;
			}
		}		
		System.out.println(c);
	}
}
				