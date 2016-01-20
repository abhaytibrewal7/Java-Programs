package TurboSort;
/*import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class TurboSort
{
	public static void main(String args[])throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int a=Integer.parseInt(br.readLine());
			int b[]=new int[a+1];
			int c;			

			for(int i=0;i<a;i++)
			{
				c=Integer.parseInt(br.readLine());
				b[c]=1;	
			}

			for(int j=0;j<b.length;j++)
			{
				while(b[i]!=0){
					System.out.println(i);
				b[i]=0;
			}}
		}
}*/
//above program exceeds time limit


//below doesnt..dont know why


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;
class TurboSort
{
	public static void main(String args[])throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(System.out);
			int a=Integer.parseInt(br.readLine());
			int b[]=new int[1000000];
			int c;			

			for(int i=0;i<a;i++)
			{
				c=Integer.parseInt(br.readLine());
				b[c]++;
			}

			for(int j=0;j<b.length;j++)
			{
			    while(b[j]!=0){
					System.out.println(j);
			    	b[j]--;
			}
			}
		//	br.close();
			pw.close();
		}
}	
			