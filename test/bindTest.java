package test;
import rmi.server.*;

import java.rmi.*;
import java.rmi.server.*;
import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.net.*;
import java.io.*;

/**
 * Server - A program to set up the 
 * server.
 * @author 陈远蔚
 *
 */
public class bindTest {
	/**
	 * The main method to set up the server.
	 * @param args A string array containing
	 * the command line arguments.
	 * @return No return value.
	 */
	public static void main(String args[]) {
		String registryURL;
		try {
			startRegistry(8010);
			DivideServerImpl divideServerImpl = new DivideServerImpl();
			registryURL =
					"rmi://localhost:8010/callback";
			Naming.rebind(registryURL, divideServerImpl);
			System.out.println("服务器已开启");
		} catch (Exception e) {
			System.out.println(
					"Exception in Server: " + e);
		}
	}
	
	/**
	 * Start up the registry service.
	 * @param portNum The number of the server port.
	 * @throws RemoteException If there exists error
	 * when connecting.
	 */
	private static void startRegistry(int portNum)
	throws RemoteException{
		try {
			Registry registry = 
					LocateRegistry.getRegistry(portNum);
			registry.list();
		} catch (RemoteException e) {
			Registry registry =
					LocateRegistry.createRegistry(portNum);
		}
		
	}
}
