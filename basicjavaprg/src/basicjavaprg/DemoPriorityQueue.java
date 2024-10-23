package basicjavaprg;

import java.util.PriorityQueue;

public class DemoPriorityQueue {

	public static void main(String[] args) throws Exception{
		PriorityQueue pq = new PriorityQueue();
		System.out.println(pq.peek());
//		System.out.println(pq.element());
		for(int i = 0;i<10;i++) {
			pq.offer(i);
		}
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq.poll());
		System.out.println(pq);
	}
}
