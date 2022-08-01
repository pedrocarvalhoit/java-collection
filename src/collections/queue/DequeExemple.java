package collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExemple {
	public static void main(String[] args) {
	
		Deque<String> deque1 = new ArrayDeque<>();
		
		deque1.add("Element 1");
		deque1.addFirst("Element 2");
		deque1.addLast("Element 3");
		
		System.out.println(deque1);
		
		Deque<String> deque2 = new ArrayDeque<>();
		
		deque2.offer("Element 1");
		deque2.offerLast("Element 2");
		deque2.offerFirst("Element 3");
		
		System.out.println(deque2);
		
		//Taking elements from the Deque
		String first = deque1.peek();
		String second = deque2.peekFirst();
		String third = deque1.peekLast();
		System.out.println(first);
		
		//Printing
		System.out.println("---Printing");
		deque1.stream().forEach(c -> {
			System.out.println(c);
		});
				
		
	}
}
