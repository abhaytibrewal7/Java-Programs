import java.io.*;


class Candies
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);

		
		int t=Integer.parseInt(br.readLine());
		int a,b;
		while(t!=0)
		{
			String[] input=br.readLine().split(" ");
			int n=Integer.parseInt(input[0]);
			int k=Integer.parseInt(input[1]);
			
			if(n==0)
			{
				pw.println("0"+" "+k);
			}
			else if(k%n==0)
			{
				pw.println(k/n + " "+"0");
			}
			else if(k%n !=0)
			{
				a=k%n;
				b=k/n;
				pw.println(b+" "+a);
			}
			t--;
		}
		pw.close();
	}
}