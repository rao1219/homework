package ProducerComsumerLab;

public class test {
	public static void main(String args[]){
		Buffer b = new Buffer(50);
		Producer p = new Producer(b);
		Thread pT=new Thread(p);
		pT.start();
		Consumer c = new Consumer(b);
		Thread cT = new Thread(c);
		cT.start();
	}
}
