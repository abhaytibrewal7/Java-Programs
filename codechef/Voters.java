import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
 
class Voters
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int i,count=0,n1,n2,n3;
		String[] input=br.readLine().split(" ");		
		n1=Integer.parseInt(input[0]);
		n2=Integer.parseInt(input[1]);
		n3=Integer.parseInt(input[2]);
		int n=n1+n2+n3+2;
		int array1[]=new int[n];
		int array2[]=new int[n];
        array1[n-2]=99999998;
		array1[n-1]=99999999;	
		for(i=0;i<n-2;i++)
			array1[i]=Integer.parseInt(br.readLine());
		Arrays.sort(array1);
		for(i=0;i<n-2;)
		{
			if(array1[i]==array1[i+1]&&array1[i]==array1[i+2])
			{
				array2[count++]=array1[i];
				i=i+3;
			}
			else if(array1[i]==array1[i+1]&&array1[i]!=array1[i+2])
			{
				array2[count++]=array1[i];
				i=i+2;
			}
			else
				i++;
		}
		System.out.println(count);
		for(i=0;i<count;i++)
		    System.out.println(array2[i]);
	}
}