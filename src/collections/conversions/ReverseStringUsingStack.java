package collections.conversions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ReverseStringUsingStack {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		System.out.println(list);
		
		//The while loop is removing always the first element
		while(list.size()> 0) {
			stack.push(list.remove(0));
		}
		
		while(stack.size()>0) {
			list.add(stack.pop());
		}
		System.out.println(list);
		
	}

}
