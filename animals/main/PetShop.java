package animals.main;

import java.util.Vector;

import animals.impl.Animal;
import animals.interfaces.Pet;

/**
 * A very simple PetShop class which allows people to store new pets.
 * Pets are stored in a Vector.
 * @author gareth
 *
 */
public class PetShop {

	public Vector<Pet> ourPets = new Vector<Pet>();
	
	
	public void addPet(Pet pet)
	{
		ourPets.add(pet);
	}
	
}
