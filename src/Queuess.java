import java.util.PriorityQueue;

// 15 - Queue (Like line at grocery store)

public class Queuess {

	public static void main(String[] args) {
	
	PriorityQueue<String> q = new PriorityQueue<String>();
	//adding elements to Queue
	q.offer("first");
	q.offer("second");
	q.offer("third");
	
	System.out.printf("%s ", q);
	System.out.println();
	
	//look for peek element and returns
	System.out.printf("%s ", q.peek());
	System.out.println();
	
	//removes first
	q.poll();
	System.out.printf("%s ", q);
	 }
 }

