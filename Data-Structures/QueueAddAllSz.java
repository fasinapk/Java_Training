package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAddAllSz {

	public static void main(String[] args) {
		Queue<String> q1= new LinkedList<>();
		q1.add("one");
		q1.add("two");
		q1.add("three");
		System.out.println("Elements of queue1 : " + q1);
		Queue<String> q2= new LinkedList<>();
		q2.add("four");
		q2.add("five");
		q2.add("six");
		System.out.println("Elements of queue2 : " + q2);
		q1.addAll(q2);
		System.out.println("Elements of queue after AddAll : " + q1);
		System.out.println("Size of the queue : "+q1.size());

	}

}
