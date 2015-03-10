package Threadsss;
import java.util.*;


//Runnable interface contains run() method
//Threads allow to do many things at the same time!

//To do Thread
// 1. Implement Runnable

public class Threadsss implements Runnable{
	String name;
	int time;
	Random r = new Random();
	
	//Constructor
	 public Threadsss(String x) {
		 name = x;
		 time = r.nextInt(999);
	 }
	 
	 //this calls whenever you start thread
	 public void run() {
		//
		 try {
			System.out.printf("%s us sleeping for %d\n",name, time );
			Thread.sleep(time);
			System.out.printf("%s is done \n",name);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	 }	

	 
}
