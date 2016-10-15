package rmi.client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

import rmi.server.IDivideServer;
import rmi.server.TwoNumbers;

/**
 * An app that runs on the client side. It gets a reference to the remote object
 * and then starts invoking remote methods.
 * @author gareth
 *
 */
public class ClientApp
{

	
	public static void main(String[] args)
	{
		System.out.println("Running client app...");
		
		// A unique URL that identifies a single service running on a server
<<<<<<< HEAD
		String registryURL = "rmi://localhost:8010/MyDivideServer";
=======
		String registryURL = "rmi://localhost/MyDivideServer";
>>>>>>> 5ada17525b70f8353bd37ada99bbdfdc90adcf67
		
		try {
			
			Remote myRemote = Naming.lookup(registryURL); //retrieves a stub for the service
			
			IDivideServer divideServerStub = (IDivideServer) myRemote; //casts the stub into our IDivideServer interface
					
			// We can now us IDivideServer as if it were a local object:
			
			double answer = divideServerStub.divide(10, 100);
			System.out.println("Retrived answer: " + answer);
			
			double addAnswer = divideServerStub.add(10, 10);
			System.out.println("Retrieved answer: " + addAnswer);
			
			TwoNumbers twoNums = divideServerStub.twoNumbers(10, 50);
			System.out.println(twoNums.d1 + " and " + twoNums.d2);
			
		} catch (MalformedURLException e) { //We need to catch various exceptions
			
			e.printStackTrace();
		} catch (RemoteException e) {
			
			e.printStackTrace();
		} catch (NotBoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
	
}
