import java.io.*;

class LUCKYSTR
{
	public static void main(String args[])throws IOException
	{	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String[] input=br.readLine().split(" ");
		int k=Integer.parseInt(input[0]);
		int n=Integer.parseInt(input[1]);
		
		int i,j,flag;			
		String t[]=new String[n];
		String s[]=new String[k];
		for(i=0;i<k;i++)
			s[i]=br.readLine();

		for(i=0;i<n;i++)
		{
			t[i]=br.readLine();
			flag=0;
			
			if(t[i].length() >= 47)
				System.out.println("Good");
			else
			{
				for(j=0;j<k;j++)
				{
					if(t[i].contains(s[j]))
					{
						flag=1;
						break;
					}
				}
			}
			if(flag==1)
				System.out.println("Good");
			else
				System.out.println("Bad");
		}
	}
}
				
			