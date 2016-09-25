package test;

import java.net.*;

public class IPfinder {
	public static void main(String args[]){
		String domainName = "www.qmul.ac.uk";
		
		InetAddress a;
		try {
			a = InetAddress.getByName(domainName);
			System.out.println(a);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
