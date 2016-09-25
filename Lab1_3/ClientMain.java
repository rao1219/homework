package Lab1_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;

public class ClientMain
{
	
	
	public static void main(String[] args)
	{
		Socket socket = null;
		try 
		{
			InetAddress ipAddr = InetAddress.getLocalHost();
			int port = 5050;
			
			System.out.println("[Client Main] Connecting to " + ipAddr);
			//This creates a socket connection to the server
			socket = new Socket(ipAddr, port);
			
			// Gets the IO streams for the socket
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			PrintWriter out = new PrintWriter(writer, true);
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			String result = null;
			for(int i=97;i<=122;i++){
				System.out.print("Send: "+i);
				out.println(i);
				result = in.readLine();
				System.out.println("\tReceived: " + result);
			}
//			while((result = in.readLine()) != null) //loops until there is no more data to read from the socket
//			{
//				System.out.println("[Client Main] Message from server: " + result); //prints out the data received
//			}
			
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				socket.close();
			}
			catch (IOException e)
			{	
				e.printStackTrace();
			}
		}
	}
}
