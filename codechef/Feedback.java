import java.io.*;
 
class Feedback
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		int flag,i;
		String s,a;
		String s1="010";
		String s2="101";
		while(t!=0)
		{
			s=br.readLine();
			flag=0;
			for(i=0;i<(s.length()-2);i++)
			{
				a=s.substring(i,i+3);
				if(a.equals(s1) || a.equals(s2) )
				{
				   // System.out.println(a);
					flag=1;
					break;
				}
					
			}
			if(flag==1)
				System.out.println("Good");
			else
				System.out.println("Bad");
			t--;
		}
	}
}