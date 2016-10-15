package Lab2;

import java.rmi.Naming;
import java.rmi.Remote;

public class Client {
	public static void main(String[] args){
		if(args.length!=1){
			System.err.println("Useage: Server + patient_id");
			System.exit(0);
		}
		String queryURL = "rmi://localhost:8010/MyQueryServer";
		
		try{
			Remote myRemote = Naming.lookup(queryURL);
			QueryInterface queryInter = (QueryInterface)myRemote;
			int id = Integer.parseInt(args[0]);
			Patient p = queryInter.getPatient(id);
			System.out.println(p);
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
