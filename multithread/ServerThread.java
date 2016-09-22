package multithread;
import java.io.*;
import java.net.*;

public class ServerThread extends Thread
{
	
	private volatile boolean acceptConnections = true; //variable to stop accepting connections
	
	public void run()
	{
		System.out.println("[ServerThread] Starting server listening...");
		ServerSocket serverSocket = null;
		
		try
		{
			// Start a ServerSocket that lists on port 5050
			serverSocket = new ServerSocket(5050);
			
			while(acceptConnections == true) //Loop around listening for connections
			{
			// Wait for a client to connect
			Socket socket = serverSocket.accept();
			
			// Creates a "handler" to deal with client
			// Allows multiple clients to be dealt with at the same time
			ServerHandler handlerThread = new ServerHandler(socket);
			handlerThread.start();
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally //A finally block *always* gets executed. It will close the listening socket.
		{
			try 
			{
				serverSocket.close();
			}
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
		}
	} //End of run()
	
} //End of class
