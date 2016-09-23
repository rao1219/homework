package ProducerComsumer;

public class Producer implements Runnable{
	private Buffer buffer;
	public Producer(Buffer b){ buffer=b; }
	@Override
	public void run() {
		for(int i=0;i<250;i++){
			buffer.put((char)('A'+(i%26)));
		}
	}
	
}
