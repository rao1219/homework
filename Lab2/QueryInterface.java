package Lab2;

import java.rmi.RemoteException;

public interface QueryInterface {
	public Patient getPatient(int id)throws RemoteException;
	public void addPatient(Patient p)throws RemoteException;
}
