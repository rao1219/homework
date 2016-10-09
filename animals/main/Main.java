package animals.main;

import animals.impl.Animal;
import animals.impl.Dog;
import animals.impl.Lion;
import animals.interfaces.Pet;

/**
 * A simple main class that just runs a few example operation on the PetShop
 * 
 * @author gareth
 *
 */
public class Main {

	public static void main(String[] args) {
		
		PetShop petShop = new PetShop();
		
		
		Dog dog = new Dog();
		dog.sleep();
		
		Pet myDogPet = (Pet) dog;
		
		petShop.addPet(dog);
		
		Lion lion = new Lion();
		lion.sleep();
		
		Pet myLionPet = (Pet) lion;
		
		
		
		Animal animal = (Animal) dog;
		
	}

}
