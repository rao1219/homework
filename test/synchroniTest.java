package test;

public class synchroniTest implements Runnable{
	
	public static Object lock = new Object();
	public static Example ex = new Example();
	public synchroniTest(Example ex){
		this.ex = ex;
	}
	public void run(){
		//synchronized(this){
			long s_time = System.currentTimeMillis();
			ex.exeWithoutSynchronized();
			System.out.println("TimeWithout"+(System.currentTimeMillis()-s_time));
			ex.exe();
			System.out.println("Time,"+(System.currentTimeMillis()-s_time));
		
		//}
		//ex.exeWithoutSynchronized();
	}
	public static void main(String args[]){
		
		Thread me = new Thread(new synchroniTest(ex));
		Thread me2 = new Thread(new synchroniTest(ex));
		Thread me3 = new Thread(new synchroniTest(ex));
		me.start();
		me2.start();
		me3.start();
	}
}
