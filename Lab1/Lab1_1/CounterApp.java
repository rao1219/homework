package Lab1_1;

public class CounterApp {
	public static void main(String args[]){
		Counter t1 = new Counter();
		Thread t2 = new Thread(new SleepyCounter());
		
		t1.start();
		t2.start();
	}
}
