package rmi.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * A remote interface. This defines the methods that we want to make remotely accessible.
 * The interface is implemented by our own DividweServerImpl. However, Java also automatically
 * generates a stub class that implements this interface.
 * 
 * Remember that this interface extends Remote.
 * @author gareth
 *
 */
public interface IDivideServer extends Remote {

	
	public double divide(double d1, double d2) throws RemoteException;
	
	public double add(double d1, double d2) throws RemoteException;


	public TwoNumbers twoNumbers(double d1, double d2) throws RemoteException;
	
}
