package codechef;
/*import java.io.*;
//import java.Math.*;

class DigitalDisplay
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String s;
		int a[]={6,2,5,5,4,5,6,3,7,6};
		int c,b,i;
		char d;
		while(t!=0)
		{
			s=br.readLine();
			c=0;
			for(i=0;i<s.length();i++)
			{
				b=Character.getNumericValue(s.charAt(i));
				c=c+a[b];
			}
			System.out.println(c);
			t--;
		}
	}
}



above runtime error

*/

import java.io.*;
//import java.Math.*;

class DigitalDisplay
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		String s;
		//int a[]={6,2,5,5,4,5,6,3,7,6};
		int c,i;
		char d;
		while(t!=0)
		{
			s=br.readLine();
			c=0;
			for(i=0;i<s.length();i++)
			{
				d=s.charAt(i);
				if(d=='0')
					c=c+6;
				else if(d=='1')
					c=c+2;
				else if(d=='2')
					c=c+5;
				else if(d=='3')
					c=c+5;
				else if(d=='4')
					c=c+4;
				else if(d=='5')
					c=c+5;
				else if(d=='6')
					c=c+6;
				else if(d=='7')
					c=c+3;
				else if(d=='8')
					c=c+7;
				else if(d=='9')
					c=c+6;
			}
			System.out.println(c);
			t--;
		}
	}
}						
					
					