package animals.impl;

/**
 * An abstract class called Animal. Because it is abstract, you cannot instantiate it
 * Instead, another class must extend it. For example, there is no such thing as an instantiated
 * Animal - there are cats, dogs, fish, which are all instances of animals
 * @author gareth
 *
 */
public abstract class Animal 
{

	/**
	 * We just have a simple eat method that all animals must implement
	 * @param food
	 */
	public abstract void eat(String food);
	
	
	public void sleep()
	{
		System.out.println("I'm sleeping! Zzzzzzzzz");
	}
	
}
