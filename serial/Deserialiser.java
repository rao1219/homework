package serial;

import java.io.*;

/**
 * A class that deserialises an object that is stored in a file. I.e. it reads a 
 * series of bytes from a file and converts it *back* into an in-memory object.
 * @author gareth
 *
 */
public class Deserialiser {

	
	public static void main(String[] args)
	{
		String filePath = "temp.txt"; //the file where our object is saved

		try {
			System.out.println("Reading object from file...");
			
			//The FileInputStream connects to temp.txt and reads in the bytes
			FileInputStream fileInput = new FileInputStream(new File(filePath));
			
			//The ObjectInputStream accepts the bytes from fileInput, so that 
			//it can convert them back into an object
			//Remember: We previously stored an object in temp.txt using writeObject()
			ObjectInputStream objectInput = new ObjectInputStream(fileInput);
			
			Object object = objectInput.readObject(); //reads the bytes from the file and turns back into an object
			
			Student student = (Student) object; //Casts the object to a Student 
			System.out.println("Read in student: " + student.name);
			
			objectInput.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
