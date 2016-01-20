import java.io.*;
 
class Bombs
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int n,i,c;
		while(t!=0)
		{
			n=Integer.parseInt(br.readLine());
			String s=br.readLine();
			
			c=0;
			for(i=0;i<n;i++)
			{
			    if(i==0)
			    {
			           if(n>1)
			           {
			               if(s.charAt(i)=='1' || s.charAt(i+1)=='1' )
			                    c++;
			           }
			           else if(s.charAt(i)=='1')
			                    c++;
			      }
			    else if(i==(n-1))
			    {
			        if(s.charAt(i)=='1' || s.charAt(i-1)=='1')
			        	c++;
			    }
				else if(s.charAt(i)=='1' || s.charAt(i+1)=='1' || s.charAt(i-1)=='1')
					c++;
			}
			System.out.println(n-c);
			t--;
		}
	}
}
	