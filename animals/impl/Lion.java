package animals.impl;

import animals.interfaces.MeatEater;

/**
 * A Lion is a type of animal. However, it does not choose to implement Pet (lions make bad pets!)
 * @author gareth
 *
 */
public class Lion extends Animal implements MeatEater
{
	@Override
	public void hunt()
	{
		System.out.println("Roar! I'm going to hunt!");
	}
	
	@Override
	public void eat(String food)
	{
		System.out.println("Roar! I love to eat " + food);
	}
}
