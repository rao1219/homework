package rmi.server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;

/** 
 * A server app that registers our newly created remote object with the RMI registry
 * This makes is available to the world!
 * 
 * Don't forget to start the rmiregistry in the same directory as these classes (not .java files).
 * @author gareth
 *
 */
public class DivideServerApp
{

	public static void main(String[] args)
	{
		System.out.println("Running a server that makes DivideServerImply available...");
				
		try {
			// An instance of our remote object
			DivideServerImpl divideServerImpl = new DivideServerImpl();
			
			// Register our new remote object with the rmiregistry
			Naming.rebind("MyDivideServer", divideServerImpl);
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}
