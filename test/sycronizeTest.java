package test;

public class sycronizeTest{
	public float money;
	public static int time = 10000;
	public sycronizeTest(){
		this.money=0;
	}
	public synchronized void increase(float a){
		this.money+=a;
	}
	public synchronized void decrease(float a){
		this.money-=a;
	}
	public static void main(String args[]){
		//while(myThread.isAlive());
		final sycronizeTest test = new sycronizeTest();
		Thread me[]= new Thread[time];
		for(int j=0;j<time;j++){
			me[j]= new Thread(new Runnable() {
				public void run() {
					// TODO Auto-generated method stub
					test.increase(100.0f);
					test.decrease(100.0f);
				}
			});
			me[j].start();
		}
		for(int i=0;i<time;i++){
			try {
				me[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(test.money);
	}
}
