import java.io.*;
import java.util.*;
//import java.lang.*;
 
class FitPlay
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 
		Scanner sc=new Scanner(System.in); 
		int t=Integer.parseInt(br.readLine());
		int a[];
		int flag,i,j,max,min;

		while(t-->0)
		{
			int n=Integer.parseInt(br.readLine());
			//String[] s=br.readLine().split(" ");
            StringTokenizer st=new StringTokenizer(br.readLine());
			a=new int[n];
			max=0;
			min=Integer.MAX_VALUE;
			for(i=0;i<n;i++){
				a[i]=Integer.parseInt(st.nextToken());
				if(a[i] < min)
				    min=a[i];
				if(a[i]-min > max)
				    max=a[i]-min;
			}
			if(max>0)
				System.out.println(max);
			else
				System.out.println("UNFIT");
		}
	}
} 