package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueChar {

	public static void main(String[] args) {
		Queue<Character> q= new LinkedList<>();
		System.out.println("Is Queue Empty? "+q.isEmpty());
		q.add('a');
		q.add('b');
		q.add('c');
		System.out.println("Elements of queue1 : " + q);
		Queue<Character> q2= new LinkedList<>();
		q2.add('d');
		q2.add('e');
		q.addAll(q2);
		System.out.println("Elements of queue2 : " + q2);
		System.out.println("Elements of queue : " + q);
		System.out.println("Removed element : "+q.remove());
		System.out.println("Queue contains a : "+q.contains('a'));
		System.out.println("Size of the queue : "+q.size());
		q.clear();
		System.out.println("Elements of queue :"+q);

	}

}
