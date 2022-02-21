package DataStructures;

import java.util.Stack;

public class StackString {

	public static void main(String[] args) {
		Stack<String> stk= new Stack<>();  
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		stk.push("Apple");  
		stk.push("Orange");  
		stk.push("Banana");  
		stk.push("Grapes");  
		stk.push("Strawberry");
		System.out.println("Elements in Stack: " + stk);  
		stk.pop();
		System.out.println("The last element is "+stk.peek());
		System.out.println("The position of Banana in the stack is "+stk.search("Banana"));
		stk.pop();
		System.out.println("The last element is "+stk.peek());
		

	}

}
