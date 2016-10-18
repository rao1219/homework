package Lab2;

import java.io.Serializable;


public class Patient implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	int yearOfBirth;
	
	Patient(int id,String name,int yearOfBirth){
		this.id = id;
		this.name = name;
		this.yearOfBirth = yearOfBirth;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String msg = "";
		msg+="Id: "+this.getId()+"\n";
		msg+="Name: "+this.getName()+"\n";
		msg+="yearOfBirth: "+this.getYearOfBirth()+"\n";
		return msg;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOfBirth() {
		return yearOfBirth;
	}
	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}
		
}
