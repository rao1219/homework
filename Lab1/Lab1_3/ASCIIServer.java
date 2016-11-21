package Lab1_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import multithread.ServerHandler;

public class ASCIIServer
{

	
	public static void main(String[] args)
	{
		System.out.println("[Server Main] Starting server listening...");
		ServerSocket serverSocket = null;
		
		try
		{
			// Start a ServerSocket that lists on port 8080
			serverSocket = new ServerSocket(8080);
			
			while(true) //Loop forever listening for connections
			{
			// Wait for a client to connect
			Socket socket = serverSocket.accept();
			
			System.out.println("[Server Main] Received new connection");
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			PrintWriter out = new PrintWriter(writer, true);

			// Sends a message via the IO stream to the socket
			//out.println("Hello! raoqi");
			String a;
			while((a=in.readLine())!=null){
				System.out.print("Received: "+a);
				int r = Integer.parseInt(a);
				if(r==-1)break;
				String res = String.copyValueOf(Character.toChars(r));
				//String res = Character.toString((char)r);
				out.println(res);
				System.out.println("\tSend: "+res);
			}
			System.out.println("\nClosing...");
			socket.close();
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
	}
}
