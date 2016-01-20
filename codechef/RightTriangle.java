import  java.io.*;
import java.util.*;


class RightTriangle
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
			
		int n,x1,y1,x2,y2,x3,y3,a1,b1,c1,c=0;
		while(t!=0)
		{
			String[] input=br.readLine().split(" ");
			x1=Integer.parseInt(input[0]);
			y1=Integer.parseInt(input[1]);
			x2=Integer.parseInt(input[2]);
			y2=Integer.parseInt(input[3]);
			x3=Integer.parseInt(input[4]);
			y3=Integer.parseInt(input[5]);
			
			a1=(x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);
			b1=(x2-x3)*(x2-x3) + (y2-y3)*(y2-y3);
			c1=(x3-x1)*(x3-x1) + (y3-y1)*(y3-y1);
			
			if(a1+b1==c1 || a1+c1==b1 || b1+c1==a1)
				c++;
			t--;
		}
		System.out.println(c);
	}
}