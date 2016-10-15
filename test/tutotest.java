package test;

public class tutotest {
	public static void main(String[] args){
		MyCountThread myCount = new MyCountThread();
		MyNameThread myName = new MyNameThread();
		Thread countT = new Thread(myCount);
		Thread nameT = new Thread(myName);
		
		countT.start();nameT.start();
	}
}
