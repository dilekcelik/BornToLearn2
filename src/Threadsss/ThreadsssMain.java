package Threadsss;

public class ThreadsssMain {
	public static void main(String[] args) {
		
		//creating elements
		Thread t1 = new Thread(new Threadsss("one"));
		Thread t2 = new Thread(new Threadsss("twoone"));
		Thread t3 = new Thread(new Threadsss("three"));
		Thread t4 = new Thread(new Threadsss("four"));
		
		//startring threads
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}
}
