package test;

public class Example {
	public Example(){
		
	}
	public synchronized void exe(){
		System.out.println("Entering...");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Leaving...");
	}
	public void exeWithoutSynchronized(){
		System.out.println("WithoutSynchronized... *");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Leaving...Without  *");
	}
}
