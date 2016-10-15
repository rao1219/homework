package rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * A class that implements our remote interface (IDivideServer).
 * Note that it also extends UnicastRemoteObject and every method
 * throws a RemoteException.
 * 
 * The rest of the code is exactly the same as if we were to be using
 * this object locally. Remember that every parameter and return type
 * used *has* to implement Serializable.
 * @author gareth
 *
 */
public class DivideServerImpl extends UnicastRemoteObject implements IDivideServer
{

	
<<<<<<< HEAD
	public DivideServerImpl() throws RemoteException
=======
	protected DivideServerImpl() throws RemoteException
>>>>>>> 5ada17525b70f8353bd37ada99bbdfdc90adcf67
		{}

	@Override
	public double divide(double d1, double d2) throws RemoteException
	{
		System.out.println("Recieved remote invocation!");
		return d1 / d2;

	}
	
	public double add(double d1, double d2) throws RemoteException
	{
		System.out.println("Adding two numbers!");
		return d1 + d2;
	}

	@Override
	public TwoNumbers twoNumbers(double d1, double d2) throws RemoteException {
		TwoNumbers num = new TwoNumbers(d1, d2);
		//TwoNumbers is an object that *must* implement Serializable
		return num;
	}

	
	
}
