package Lab2;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface QueryInterface extends Remote{
	public Patient getPatient(int id)throws RemoteException;
	public void addPatient(Patient p)throws RemoteException;
}
