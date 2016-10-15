package Lab2;
import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {
	public static void main(String args[]){
		
		Patient p1 = new Patient(1001,"Tom",1967);
		Patient p2 = new Patient(1002,"Sarah",1986);
		Patient p3 = new Patient(1003,"Ben",1975);
		Patient p4 = new Patient(1004,"Eileen",1984);
		
		try {
			startRegistry(8010);
			QueryImpl myQuery = new QueryImpl();
			myQuery = new QueryImpl();
			myQuery.addPatient(p1);
			myQuery.addPatient(p2);
			myQuery.addPatient(p3);
			myQuery.addPatient(p4);
			
			Naming.rebind("rmi://localhost:8010/MyQueryServer",myQuery);
		} catch (RemoteException | MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
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
