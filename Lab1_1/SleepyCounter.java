package Lab1_1;

public class SleepyCounter implements Runnable{
	public void run(){
		for(int i=10;i<=500;i++){
			System.out.println("SleepyCount: "+i);
			try {Thread.sleep(50);} catch (InterruptedException e) {}
		}
	}
}
