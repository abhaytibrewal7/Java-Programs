/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package NetworkingPrograms;
import java.io.*;
import java.net.*;
/**
 *
 * @author CSE311
 */
public class test1Server extends Thread
//import java.util.*;
	{ 
		ServerSocket ss;
		static Socket s;
		public test1Server()
		{ 
			System.out.println("server is ready");
			try
			{
				ss=new ServerSocket(25003);
				s=ss.accept();
				
			}
			catch(Exception e)
			{
			System.out.println(e);
			}
		start();	
	
		}
		public void run()
		{ 
			try
			{  
				DataInputStream dis=new DataInputStream(s.getInputStream());
				while(true)
				{
					System.out.println("client"+ dis.readUTF());
					sleep(250);
				}
			}
				catch(Exception e)
				{ 
					System.out.println(e);
				}
			}
			
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new test1Server(); 
try{
	DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	while(true)
	{
		dos.writeUTF(br.readLine());
	}
}
catch(Exception e)
{
	System.out.println(e);
}
	}

}
