package serial;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;

/**
 * A class that creates a Student object and then serialises it (converts the in-memory object
 * into a bytes). It then writes it into a file. Take a look inside the file! What do you see?
 * You'll see Java's way of serialising objects
 * @author gareth
 *
 */
public class Serialiser {

		
	public static void main(String[] args)
	{
		//The file to write the object to
		String filePath = "temp.txt";

		// We create a new student
		Student student = new Student("Gareth", "ABC123");
		
		try {
			System.out.println("Writing student to file...");
			//The FileOutputStream deals with opening and writing into the file
			FileOutputStream fileOut = new FileOutputStream(new File(filePath));
			
			//The ObjectOutputStream convets our object into a sequence of bytes.
			//Note that we pass the FileOutputStream in as a parameter - this "plugs" the 
			//ObjectOutputStream to the FileOutputStream so that the object is written
			//into the file.
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			
			objectOut.writeObject(student); //we write our serialised Student out to the file
			objectOut.close(); //we always close streams (because they're an expensive resource)
			
		} catch (FileNotFoundException e) { //Need to catch a few exceptions...
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
