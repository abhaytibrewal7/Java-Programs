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
public class test1Client extends Thread{

    
//import java.util.*;

	static Socket s;
	DataInputStream dis;
	public test1Client()
	{		try
		{
			System.out.println("client is ready");
			s=new Socket("Localhost", 25003);
			dis= new DataInputStream(s.getInputStream());
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
	start();
	}	public void run()
	{
		while(true)
		{
		try
		{  
			System.out.println("server"+ dis.readUTF());
			sleep(250);
		}
		catch(Exception e)
		{
		System.out.println(e);
		}
}}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
new test1Client();
try{
	DataOutputStream dos=new DataOutputStream(s.getOutputStream());
	InputStreamReader isr=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(isr);
	while(true)
	{
		String msg=br.readLine();
		if(msg.equals("Bye Bye"))
		System.exit(0);
		dos.writeUTF(msg);
	}
	}
catch(Exception e)
{
System.out.println(e);
}
	}
}

