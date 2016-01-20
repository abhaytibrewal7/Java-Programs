import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Holes
{
	public static void main(String args[])throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int a=Integer.parseInt(br.readLine());
			//char b[]=new char[100];
			int j=0,c;
			
			for(int i=0;i<a;i++)
			{
				String s=br.readLine();
				//b=s;
				c=0;
				for(j=0;j<s.length();j++)
				{
					if(s.charAt(j)=='B')
						c=c+2;
					else if(s.charAt(j)=='A' || s.charAt(j)=='D' ||s.charAt(j)=='O' || s.charAt(j)=='P' || s.charAt(j)=='R' || s.charAt(j)=='Q')
						c++;
				}
				System.out.println(c);
			}
		}
}	
				
	
				
