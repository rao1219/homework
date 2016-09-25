package sockets;
import java.net.*;
import java.io.*;

public class myClient {
	public static void main(String args[]) throws IOException{
		InetAddress addr = InetAddress.getByName(null);
		System.out.println("addr = " +addr);
		Socket socket = new Socket(addr,myServer.PORT);
		try{
			System.out.println("socket =" +socket);
			BufferedReader in = new BufferedReader(new
					InputStreamReader(socket.getInputStream()));
			PrintWriter out = new PrintWriter(new
					BufferedWriter(new OutputStreamWriter(
					socket.getOutputStream())), true);
			for(int i=0;i<10;i++){
				out.println("howdy "+i);
				String str = in.readLine();
				System.out.println(str);
			}
			out.println("END");
		}
		finally{
			System.out.println("Closing...");
			socket.close();
		}
	}
}
