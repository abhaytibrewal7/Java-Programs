import java.io.*;
import java.util.*;

class Point
{
	int x,y;
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
}

class PointsDist
{
	public static void main(String [] args) throws IOException
	{
	   Scanner in=new Scanner(System.in);
	   int tc=in.nextInt();
	   int i;
	   while(tc-->0)
	   {
	   	  int n=in.nextInt();
	   	  Point pt[]=new Point[n];
	   	  for(i=0;i<n;i++)
	   	  {
	   	  	pt[i]=new Point(in.nextInt(),in.nextInt());
	   	  }
	   	  Arrays.sort(pt,new Comparator<Point>(){
	   	  	//@override
	   	  	public int compare(Point a,Point b){
	   	  		if(a.x==b.x)
	   	  			return b.y-a.y;
	   	  		else
	   	  			return a.x-b.x;
	   	  	}
	   	  });
	   	 /* for(i=0;i<n;i++)
	   	  {
	   	      System.out.println(pt[i].x+" "+pt[i].y);
	   	      }*/
	   	  double ans=0.0;
	   	  int x,y;
	   	  for(i=1;i<n;i++)
	   	  {
	   	  	 x=pt[i].x-pt[i-1].x;
	   	  	 y=pt[i].y-pt[i-1].y;
	   	  	 ans +=Math.sqrt(x*x+y*y);
	   	  }
	   	  System.out.printf("%.2f\n",ans);

	   }
	   }
}