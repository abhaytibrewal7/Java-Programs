import java.io.*;

 
class YourMineName
{
	public static void main(String args[])throws IOException
	{	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter pw=new PrintWriter(System.out);
		int t=Integer.parseInt(br.readLine());
		String a,b;
		int c=0,l1,l2,i,j,k;
		while(t!=0)
		{
			String[] input=br.readLine().split(" ");
			a=input[0];
			b=input[1];

			l1=a.length();
			l2=b.length();
			
			
			
			if(l1<=l2){
			c=0;
			k=0;
			for(i=0;i<l1;i++)
			{
				for(j=k;j<l2;j++)
				{
					if(a.charAt(i)==b.charAt(j))
					{
						//pw.print(b.charAt(j));
						c++;
						k=j+1;
						break;
					}
				}
			
			}
			//pw.println(c+ "  "+l1);
			if(c==l1)
				pw.println("Yes");
			else
				pw.println("No");
			}
			else if(l2 < l1)
			{
		     	c=0;
			k=0;
			for(i=0;i<l2;i++)
			{
				for(j=k;j<l1;j++)
				{
					if(b.charAt(i)==a.charAt(j))
					{
						//pw.print(b.charAt(j));
						c++;
						k=j+1;
						break;
					}
				}
			
			}
			//pw.println(c+ "  "+ l2);
			if(c==l2)
				pw.println("Yes");
			else
				pw.println("No");
			
			}
			t--;
		}
		pw.close();
	}
}
						