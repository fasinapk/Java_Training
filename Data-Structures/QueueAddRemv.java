package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class QueueAddRemv {

	public static void main(String[] args) {
		Queue<String> q= new LinkedList<>();
		q.add("one");
		q.add("two");
		q.add("three");
		q.add("four");
		q.add("five");
		System.out.println("Elements of queue : " + q);
		System.out.println("Removed element : "+q.remove());

	}

}
