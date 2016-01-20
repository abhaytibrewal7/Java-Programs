package codechef;
import java.lang.*;
import java.util.*;

class atm
{
	public static void main(String args[])throws java.io.IOException
	{	
		Scanner sc=new Scanner(System.in);
		int a;
		double b;
		a=sc.nextInt();
		b=sc.nextDouble();
		if(b >=0 && b<=2000)
		{
			if(a>0 && a<=2000 && (a%5)==0 && a+0.5<=b)
				b=b-a-0.5;
		
		}
		System.out.printf("%.2f",b);
	}
}
		