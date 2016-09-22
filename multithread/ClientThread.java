package multithread;
import java.io.*;
import java.net.*;

/**
 * Creates a Socket connection to a particular IP:port
 * Sends a hello message via the socket
 * @author gareth
 *
 */
public class ClientThread extends Thread
{
	// The IP address to connect to
	InetAddress ipAddr = null;
	//The port number to connect to
	int port = 5050;
	
	public ClientThread(InetAddress ipAddr, int port)
	{
		this.ipAddr = ipAddr;
		this.port = port;
	}
	
	public void run()
	{
		Socket socket = null;
		try 
		{
			//This creates a socket connection to the server
			socket = new Socket(ipAddr, port);
			
			// Gets the IO streams for the socket
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			PrintWriter printWriter = new PrintWriter(writer, true);
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			// Sends a message via the IO stream to the socket
			printWriter.println("Hello! I'm client: " + Thread.currentThread().getName());
			
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
		
	}// End of run()
	
} //End of class
