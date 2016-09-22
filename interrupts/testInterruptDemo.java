package interrupts;

public class testInterruptDemo implements Runnable{
	@Override
	public void run(){
		System.out.println("Thread start...");
		while(!Thread.currentThread().isInterrupted()){
			System.out.println("Running...");
			try{
				Thread.sleep(2000);
			}catch(InterruptedException ex){
				System.out.println("I have been interrupted...");
				Thread.currentThread().interrupt();
			}
		}
		System.out.println("End of Thread...");
	}
	public static void main(String args[]){
		Thread myThread = new Thread(new testInterruptDemo());
		myThread.start();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		myThread.interrupt();
	}
}
