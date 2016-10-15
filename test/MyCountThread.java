package test;

public class MyCountThread implements Runnable{
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<100;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
	}
}
