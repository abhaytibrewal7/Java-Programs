import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class HotelByte
{
	public static void main(String args[])throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int t=Integer.parseInt(br.readLine());
			int j=0,c,n,max,i,min,max2;
			int a[];
			int b[];
			while(t!=0)
			{
				n=Integer.parseInt(br.readLine());
				a=new int[n];
				b=new int[n];
				String[] input=br.readLine().split(" ");
				min=0;
				for(j=0;j<n;j++){
					a[j]=Integer.parseInt(input[j]);
					if(a[j] < min)
						min=a[j];
				}
			//	System.out.println(min);
				max=0;
				String[] input1=br.readLine().split(" ");
				for(j=0;j<n;j++){
					b[j]=Integer.parseInt(input1[j]);
					if(b[j] > max)
						max=b[j];
				}
			//	System.out.println(max);
				max2=0;
				for(i=min;i<=max;i++)
				{
				    c=0;
			        for(j=0;j<n;j++)
			        {
			            if(a[j] <= i && b[j] > i)
					    	c++;
				    }
					if(c > max2)
						max2=c;
				}
				System.out.println(max2);
				t--;
			}
		}
}