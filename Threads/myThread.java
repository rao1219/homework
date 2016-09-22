package Threads;

public class myThread implements Runnable{
	@Override
	public void run(){
		System.out.println("Hello,world!");
		while(Thread.currentThread().isInterrupted()==false){
			System.out.println("Running..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("This thread has been interrupted...");
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("The end of thread.");
	}
	public static void main(String[] args){
		myThread me= new myThread();
		Thread myThread = new Thread(me);
		//myThread.setDaemon(true);
		myThread.start();
		try {Thread.sleep(2000);} catch (InterruptedException e) {}
		myThread.interrupt();
	}
}
