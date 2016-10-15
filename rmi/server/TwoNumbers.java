package rmi.server;

import java.io.Serializable;

/**
 * A simple example class that is going to be returned by our remote object.
 * Note that this object is Serializable. What happens if you remove
 * "implements Serializable" from the class declaration?
 * @author gareth
 *
 */
public class TwoNumbers implements Serializable {

	public double d1;
	public double d2;
	
	public TwoNumbers(double d1, double d2)
	{
		this.d1 = d1;
		this.d2 = d2;
	}
}
