package codechef;
import java.io.*;
import java.util.*;
class BirthdayCandle
 
{
 
    public static void main(String args[]) throws IOException
 
    {
 
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
 
        PrintWriter bf = new PrintWriter(new BufferedOutputStream(System.out));
 
        int max = Integer.parseInt(sc.readLine());
        while(max-->0)	
        {
            StringBuffer buf = new StringBuffer();
            String temp[] = new String[10];
            temp = sc.readLine().split(" ");
            int candles[] = new int[10];
            for(int i = 0; i<temp.length;i++)
            {
                candles[i]  = Integer.parseInt(temp[i]);
            }
            candles[0]++;
            int min = candles[0];
            int minindex = 0;
            for(int i = 0;i<candles.length;i++)
            {
                if(candles[i]<min)
                {
                    min = candles[i];
                    minindex = i;
                }
            }
            if(minindex == 0)
                buf.append((int)Math.pow(10,candles[0]));
            else
            {
                for(int i = 0;i<=min;i++)
                {
                    buf.append(minindex);
                }
            }
            bf.println(buf);
        }
         bf.close();
         //sc.close();
    }
}