package Threads;

public class ex2Demo {
	public static void main(String[] args){
		ex2 me= new ex2();
		Thread myThread = new Thread(me);
		//myThread.setDaemon(true);
		myThread.start();
		try {Thread.sleep(3000);} catch (InterruptedException e) {}
		me.finishThread();
		//myThread.interrupt();
	}
}
