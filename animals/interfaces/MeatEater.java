package animals.interfaces;

/**
 * An interface that shows an animal eats meat. Remember, a class can implement multiple interfaces.
 * So, a class could be both a Pet and a MeatEater! This wouldn't work with class inheritance (because
 * a class can only extend one other class)
 * @author gareth
 *
 */
public interface MeatEater {

	
	/**
	 * A method to make the animal hunt
	 */
	public void hunt();
}
