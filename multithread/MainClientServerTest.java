package multithread;
import java.net.*;
import java.io.*;


public class MainClientServerTest {

	public static void main(String[] args)
	{
		// Starts running server
		ServerThread serverThread = new ServerThread();
		serverThread.setDaemon(true); //Will automatically terminate when Main thread does
		serverThread.start();
		
		
		
		try {
			// Sleep for a 1 second
			Thread.sleep(100000000);
			
			for(int i=0; i<5; i++) //Loops 5 times
			{
				// Creates a client thread to connect to localhost (127.0.0.1)
				InetAddress  ipAddr = InetAddress.getLocalHost();
				ClientThread clientThread = new ClientThread(ipAddr, 5050);
				clientThread.setDaemon(true); //automatically terminate when main thread does
				clientThread.start();
				
				Thread.sleep(1000); //Wait 1 second between making clients
			}
			
			//After creating thread, sleep (stay alive) for 10 seconds
			//Then terminate. Because all other threads are daemon threads
			//They will automatically terminate as well.
			Thread.sleep(10000);
		} 
		catch (UnknownHostException e)
		{
			e.printStackTrace();
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
		
	}


}
