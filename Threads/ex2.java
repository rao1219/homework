package Threads;

import javax.print.attribute.standard.Finishings;

public class ex2 implements Runnable{
	private boolean pleaseFinish=false;
	@Override
	public void run(){
		System.out.println("Hello,world!");
		//while(Thread.currentThread().isInterrupted()==false){
		while(!pleaseFinish){
			
		}
		System.out.println("End.");
	}
	public void finishThread(){
		pleaseFinish=true;
	}
	
}
