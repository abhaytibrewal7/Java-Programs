import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class DecreasingString
{
	public static void main(String args[])throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int a=Integer.parseInt(br.readLine());
			int j=0,b,k,c,d;
			String s="zyxwvutsrqponmlkjihgfedcba";
			for(int i=0;i<a;i++)
			{
				b=Integer.parseInt(br.readLine());
				if(b==0)
				    System.out.println("a");
				else{
				c=b/25;
				d=b%25;
				k=97+d;
				for(j=k;j>=97;j--)
				{
				    if(d==0)
				        break;
					System.out.print((char)j);
				}
				while(c!=0){
				        System.out.print(s);
				    c--;
				}
				System.out.println();
			}}
		}	
}

			
