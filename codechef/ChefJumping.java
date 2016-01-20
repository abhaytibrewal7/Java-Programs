import java.io.*;


class ChefJumping
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw=new PrintWriter(System.out);

		long t=Long.parseLong(br.readLine());
		//int a[]={1,2,3};
		int c=0,i,flag=0;
		if(t==0){
			pw.println("yes");
			flag=1;
		}
		else{
		    t=t%6;
		    if(t==0 || t==1 || t==3)
		    {
		      pw.println("yes");
		      flag=1;
		    }
		}
		if(flag==0)
			pw.println("no");
		
		pw.close();
	}
}
