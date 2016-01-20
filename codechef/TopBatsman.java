import java.io.*;
import java.util.Arrays;
//import java.util.Collections;
 
class TopBatsman
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	
		int n=Integer.parseInt(br.readLine());
		int a[]=new int[11];
		int i,c,d,m,l,p,z;
		while(n-->0)
		{	
		    String[] input=br.readLine().split("\\s+");
			for(i=0;i<11;i++)
				a[i]=Integer.parseInt(input[i]);
 
			int k=Integer.parseInt(br.readLine());
			Arrays.sort(a);
			for(i=0;i<a.length/2;i++) {
                int temp = a[i];
                 a[i] = a[a.length-(i+1)];
                a[a.length-(i+1)] = temp;
            }
            /*for(i=0;i<11;i++)
                System.out.print(" "+a[i]);*/
			c=1;
			d=1;
			if(a[k-1]==a[k])
			{
				for(i=0;i<=10;i++)
				{
					if(a[i]==a[k-1])
						c++;
				}
				c=c-1;
				if(a[k-1]==a[k-2])
				{
					for(i=0;i<k-1;i++)
					{
						if(a[i]==a[k-1])
							d++;
					}
				}
				//System.out.println("c: "+c);
				//System.out.println("d: "+d);
				m=fact(c);
				z=fact(d);
				l=fact(c-d);
				p=m/(z*l);
				//System.out.println("cm: "+m);
				//System.out.println("dn: "+n);
				//System.out.println("dc: "+l);
				System.out.println(p);
			}
			else{
				System.out.println("1");
				}
		}
	}
	public static int fact(int n)
	{
		int f=1;
		if(n==0)
		    return 1;
		else{    
		for(int i=2;i<=n;i++)
			f=f*i;
		return f;
		}
	}
}

