package collections.stack;

import java.util.Stack;

public class StackPrint {
	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.push(100);
		stack.push(200);
		stack.push(300);
		
		stack.forEach(e -> {
			System.out.println(e);
		});
		
	}
}
