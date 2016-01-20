import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Stones
{
	public static void main(String args[])throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=Integer.parseInt(br.readLine());
			int i,k,c;
			String j,s;
			while(t!=0)
			{
				j=br.readLine();
				s=br.readLine();
				c=0;
				for(i=0;i<s.length();i++)
				{
					for(k=0;k<j.length();k++)
					{
						if(s.charAt(i)==j.charAt(k))
						{
							c++;
							break;
						}
					}
				}
				System.out.println(c);
				t--;
			}
		}
}				