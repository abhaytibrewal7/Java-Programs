import java.io.*;
import java.util.Arrays;
 
class WeightDiff
{
	public static void main(String args[])throws IOException
	{	
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		PrintWriter pw=new PrintWriter(System.out);
		int t=Integer.parseInt(br.readLine());
		int a[];
		int i,s,d;
		while(t!=0)
		{
			String[] input=br.readLine().split(" ");
			
			int n=Integer.parseInt(input[0]);
			int k=Integer.parseInt(input[1]);
			
			a=new int[n];
	
			String[] input1=br.readLine().split(" ");
			
			s=0;
			for(i=0;i<n;i++)
			{
				a[i]=Integer.parseInt(input1[i]);
				//s=s+a[i];
			}
			Arrays.sort(a);
			if(k<=n/2){	
			d=0;
			s=0;
			for(i=0;i<k;i++)
			{
				d=d+a[i];
			}
			for(i=k;i<n;i++)
		    {
				s=s+a[i];
		    }
			}
			else{
            d=0;
			s=0;
			for(i=0;i<n-k;i++)
			{
				d=d+a[i];
			}
			for(i=n-k;i<n;i++)
		    {
				s=s+a[i];
		    }
		
			}
		    //pw.println(s);
			pw.println(s-d);
			
			
			pw.flush();
			t--;
    	}
    	pw.close();
	}
	
}