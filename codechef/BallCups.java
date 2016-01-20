import java.io.*;
 
class BallCups
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);
		
		int t=Integer.parseInt(br.readLine());
		int i,n,c,q,l,r,temp,high,low;
		int a[];
		while(t!=0)
		{
			String[] input=br.readLine().split(" ");
			
			n=Integer.parseInt(input[0]);
			c=Integer.parseInt(input[1]);
			q=Integer.parseInt(input[2]);
			a=new int[n+1];
			a[c]=1;
			while(q!=0)
			{
				String[] input1=br.readLine().split(" ");
				l=Integer.parseInt(input1[0]);
				r=Integer.parseInt(input1[1]);
                
                if(l<=c && c<=r)
                {
                    low=c-l;
                    c=r-low;
                }
                
				q--;
			}
		   	pw.println(c);
			t--;
		}
		pw.close();
	}
}		
