package join;

public class MainTest {

	public static void main(String[] args)
	{
		
		// Creates a thread that (pretends to) read data from a file
		ReadRunnable readRunnable = new ReadRunnable();
		Thread readThread = new Thread(readRunnable);
		
		//Creates a thread that (pretends to) generate graphs from the data
		GraphGeneratorRunnable graphRunnable = new GraphGeneratorRunnable(readThread);
		Thread graphThread = new Thread(graphRunnable);
		
		// Launches threads
		readThread.start();
		graphThread.start();
		
	}

}
