package test;

public class MyNameThread implements Runnable{
	public void run(){
		while(true){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Qi RAO");
		}
	}
}
