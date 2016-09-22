package nameresolver;
import java.net.*;


public class NameResolverClass {

	
	public static void main(String[] args)
	{
		String domainName = "www.eecs.qmul.ac.uk";
		String IP = null;
		try {
			IP = InetAddress.getByName(domainName).getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(domainName + "  -> " + IP);
		
	}
	
}
