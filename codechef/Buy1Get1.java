import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
class Buy1Get1
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int b=Integer.parseInt(br.readLine());
		String s;
		int i,j,t=0,c=0,k,l;
		int a[];
		for(i=0;i<b;i++)
		{
			s=br.readLine();
			l=s.length();
			a=new int[l];
			t=0;
			for(k=0;k<s.length();k++)
			{
			    c=0;
			    for(j=k;j<s.length();j++)
			    {
			        if(s.charAt(k)==s.charAt(j) && a[j]!=1)
			        {
			            c++;
			            a[j]=1;
			        }
			    }
			    if(c%2==0)
			        t=t+c/2;
			    else
			        t=t+c/2+1;
			}
			System.out.println(t);
		}
	}
}		