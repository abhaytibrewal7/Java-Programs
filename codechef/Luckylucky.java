import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Luckylucky
{
	public static void main(String args[])throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=Integer.parseInt(br.readLine());
			int rem,flag=0,n,m;
			while(t!=0)
			{
				n=Integer.parseInt(br.readLine());
				flag=0;
				m=n;
				rem=n%7;
				n=n-rem;
				while(n>0)
				{
					if((rem % 4)==0 && (n%7) == 0)
					{
						flag=1;
						System.out.println(n);
						break;
					}
					else
					{
						rem=rem+7;
						n=n-7;
					}
				}
				if(flag==0 && (m%4)==0)
					System.out.println("0");
				else if(flag==0)
				    System.out.println("-1");
				    
				t--;
			}
		}
}
	
				