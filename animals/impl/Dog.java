package animals.impl;

import animals.interfaces.MeatEater;
import animals.interfaces.Pet;

/**
 * A class that extends Animal and implements the pet functionality (i.e. play).
 * Try commenting out the methods below. What happens? You won't be able to compile
 * anymore. You *have* to implement any abstract methods in the superclass AND any
 * methods declared in the Pet interface. 
 * @author gareth
 *
 */
public class Dog extends Animal implements Pet, MeatEater
{

	
	public void eat(String food)
	{
		System.out.println("Yum! This dog enjoys " + food);
	}

	@Override
	public void play() {
		System.out.println("Woof! Throw a ball for me!");
	}

	@Override
	public void hunt() {
		System.out.println("Woof! I'm going to hunt down some food!");
		
	}
	
	public boolean isPlayful()
	{
		return true;
	}
	
}
