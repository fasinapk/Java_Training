package DataStructures;

import java.util.LinkedList;
import java.util.Queue;

public class ContainIsEmpClear {

	public static void main(String[] args) {
		Queue<String> q1= new LinkedList<>();
		System.out.println("Is Queue Empty? "+q1.isEmpty());
		q1.add("one");
		q1.add("two");
		q1.add("three");
		System.out.println("Elements of queue : " + q1);
		System.out.println("Is Queue Empty? "+q1.isEmpty());
		System.out.println("Queue contains two : "+q1.contains("two"));
		System.out.println("Queue contains six : "+q1.contains("six"));
		q1.clear();
		System.out.println("Elements of queue :"+q1);

	}

}
