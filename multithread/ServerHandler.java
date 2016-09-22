package multithread;
import java.io.*;
import java.net.*;

/**
 * This class deals with a request from a client.
 * It simply prints out the text sent to it.
 * @author gareth
 *
 */
public class ServerHandler extends Thread
{
	// The client socket
	Socket socket = null;
	
	public ServerHandler(Socket socket)
	{
		this.socket = socket;
	}
	
	
	
	public void run()
	{
		System.out.println("[Server Handler] Handling connection from: " + socket.getInetAddress());
		
		try {
			// Gets the IO streams from the socket
			BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
						
			String line = null;
			while((line = reader.readLine()) != null) //loops until there is no more data to read from the socket
			{
				System.out.println("[Server Handler] Received: " + line); //prints out the data received
			}
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
				{e.printStackTrace();}
		}
	} //End of run()
	
} //End of class
