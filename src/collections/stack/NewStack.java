package collections.stack;

import java.util.Stack;

public class NewStack {
	public static void main(String[] args) {

		// No cast necessary anymore
		Stack<String> stack = new Stack<>();
		stack.push("1");
		stack.push("2");
		stack.push("3");

		System.out.println(stack);

		// Getting the values out of the stack
		String three = stack.pop();
		String two = (String) stack.peek();
		System.out.println(three);
		System.out.println(two);

		// Stack Order
		System.out.println("--- Order");
		Stack<String> order = new Stack<>();
		
		order.push("one");
		int index1 = order.search("one");
		
		order.push("two");
		int index2 = order.search("one");
		
		order.push("three");
		int index3 = order.search("one");
		
		/** When the element is not founded, the stack return -1*/
		int indexABC = order.search("ABC");
		
		System.out.println(index1);
		System.out.println(index2);
		System.out.println(index3);
		System.out.println(indexABC);
	}

}
