package Lab2;

import java.util.ArrayList;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class QueryImpl extends UnicastRemoteObject implements QueryInterface{
	
	ArrayList<Patient> PatientList;
	public QueryImpl() throws RemoteException{
		this.PatientList = new ArrayList<Patient>();
	}
	public void addPatient(Patient p){
		this.PatientList.add(p);
	}
	@Override
	public Patient getPatient(int id) throws RemoteException{
		// TODO Auto-generated method stub
		for(int i=0;i<this.PatientList.size();i++){
			if(PatientList.get(i).getId()==id){
				return PatientList.get(i);
			}
		}
		return null;
	}
	
}
