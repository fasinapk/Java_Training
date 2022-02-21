package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDouble {

	public static void main(String[] args) {
		Queue<Double> q= new LinkedList<>();
		System.out.println("Is Queue Empty? "+q.isEmpty());
		q.add(12.236);
		q.add(25.123);
		q.add(2.154);
		System.out.println("Elements of queue1 : " + q);
		Queue<Double> q2= new LinkedList<>();
		q2.add(11.23);
		q2.add(45.23);
		q.addAll(q2);
		System.out.println("Elements of queue2 : " + q2);
		System.out.println("Elements of queue : " + q);
		System.out.println("Queue contains 2.154 : "+q.contains(2.154));
		System.out.println("Removed element : "+q.remove());
		System.out.println("Size of the queue : "+q.size());
		q.clear();
		System.out.println("Elements of queue :"+q);

	}

}
