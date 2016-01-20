package codechef;
/* 
//import java.lang.*;
//import java.util.*;

class input
{
	public static void main(String args[])throws java.lang.Exception
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int e=a;
		//System.out.println();
		int c[]=new int[a+1];
		int d,k=0;
		//if(b <= Math.pow(10,7))
		//{
			while(a!=0)
			{
				d=sc.nextInt();
				if(/*d< Math.pow(10,9) &&*/ //d%b==0)
				//{	
				//	k++;
				//	a--;
		
				//}
				//System.out.println();
			//}
		//}
		/*int k=0;
		for(int i=1;i<=e;i++)
		{
			if(c[i]%b == 0)
				k++;
		}
		System.out.println(k);
	}			
				
}*/



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class LargeInputTest {
 
	public static void main(String[] args) throws IOException {
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		String[] input = r.readLine().split(" ");
		int count = 0;
		int k = Integer.parseInt(input[0]);
		int l = Integer.parseInt(input[1]);
		for (int j = 0; j < k; j++) {
			if (Integer.parseInt(r.readLine()) % l == 0) {
				count++;
			}
		}
		System.out.println(count);
	}
}				