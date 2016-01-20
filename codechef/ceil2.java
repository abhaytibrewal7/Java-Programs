import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
class ceil2
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int i,b,j,s=0,k,l;
		int c[]={1,2,4,8,16,32,64,128,256,512,1024,2048};
		for(i=0;i<a;i++)
		{
		    s=0;l=0;
			b=Integer.parseInt(br.readLine());
			for(j=11;j>=0;j--)
			{
				if(c[j] <= b )
					break;
			}
			s=s+c[j];
			for(k=j;k>=0;k--)
			{
				while((s+c[k]) <= b)
				{
				    l++;
					s=s+c[k];
				}
			}
			System.out.println(l+1);			
		}
								
	}
} 