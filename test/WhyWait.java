package test;

public class WhyWait extends Thread
{
	public static volatile int sum = 0;
	
	public void run()
	{
			
		synchronized(this) //use its own lock
		{
			for(int i=0; i<10; i++)
			{
				sum = sum + i; //manipulates the sum variable
			}
			
			notify(); //notify any threads waiting on this monitor to wake up
		}
		
		
	}
	public static void main(String[] args)
	{
		
		WhyWait ww = new WhyWait();
		ww.start();
		
		
		
		// Gets locks for ww before continuing
		synchronized(ww)
		{
			try {
				ww.wait();  //waits for notify signal from ww. We wait for a maximum of 100 ms
			} 
			catch (InterruptedException e)
			{} //this catch should really do something useful (but for a simple demo, we leave it blank)
			
		}
		
		
		System.out.println("Sum = " + WhyWait.sum);
	}
	
	
	
}
