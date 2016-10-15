package serial;

import java.io.*;

/**
 * A simple class for storing information about a Student. It just contains a name, identifier.
 * . Notice that the Student class implements Serializable. This means that we
 * allow this class to be serialized by Java. 
 * @author gareth
 *
 */
public class Student implements Serializable
{
	/**
	 * This is a version number for this class. If we change the class in the future, we
	 * should change this number. It is not mandatory for inclusion, but it is good
	 * practice. 
	 */
	private static final long serialVersionUID = 5226805474632998L;

	public String name = null;
	public String identifier = null;
		
	/**
	 * Creates a new instance of Student with a new name and identifier
	 */
	public Student(String name, String identifier) {
		this.name = name;
		this.identifier = identifier;
	}
	
	
}
