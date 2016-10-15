package rmi.server;

import java.net.MalformedURLException;
import java.rmi.AlreadyBoundException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
<<<<<<< HEAD
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

=======
>>>>>>> 5ada17525b70f8353bd37ada99bbdfdc90adcf67

/** 
 * A server app that registers our newly created remote object with the RMI registry
 * This makes is available to the world!
 * 
 * Don't forget to start the rmiregistry in the same directory as these classes (not .java files).
<<<<<<< HEAD
 * @author Qi Rao
=======
 * @author gareth
>>>>>>> 5ada17525b70f8353bd37ada99bbdfdc90adcf67
 *
 */
public class DivideServerApp
{

	public static void main(String[] args)
	{
		System.out.println("Running a server that makes DivideServerImply available...");
				
		try {
			// An instance of our remote object
<<<<<<< HEAD
			startRegistry(8010);
			DivideServerImpl divideServerImpl = new DivideServerImpl();
			
			// Register our new remote object with the rmiregistry
			Naming.rebind("rmi://localhost:8010/MyDivideServer", divideServerImpl);
=======
			DivideServerImpl divideServerImpl = new DivideServerImpl();
			
			// Register our new remote object with the rmiregistry
			Naming.rebind("MyDivideServer", divideServerImpl);
>>>>>>> 5ada17525b70f8353bd37ada99bbdfdc90adcf67
		} 
		catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
<<<<<<< HEAD
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
=======
>>>>>>> 5ada17525b70f8353bd37ada99bbdfdc90adcf67
}
