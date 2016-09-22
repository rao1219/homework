package Lab1;

public class Counter extends Thread{
	@Override
	public void run(){
		for(int i=10;i<=500;i++){
			System.out.println("Count: "+i);
		}
	}
}
