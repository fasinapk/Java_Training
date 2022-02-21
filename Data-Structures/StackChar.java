package DataStructures;

import java.util.Stack;

public class StackChar {

	public static void main(String[] args) {
		Stack<Character> stk= new Stack<>();  
		boolean result = stk.empty();  
		System.out.println("Is the stack empty? " + result);  
		stk.push('a');  
		stk.push('b');  
		stk.push('c');  
		stk.push('d');  
		System.out.println("Elements in Stack: " + stk);  
		System.out.println("The position of d in the stack is "+stk.search('d'));
		stk.pop();
		System.out.println("The last element in stack after pop is "+stk.peek());

	}

}
