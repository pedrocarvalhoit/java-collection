package collections.queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;


public class QueueExample {

	public static void main(String[] args) {
		
		Queue<Customer> queue1 = new LinkedList<>();
		
		queue1.add(new Customer("Anna"));
		queue1.add(new Customer("Paulo"));
		
		// Removing with POLL that just return null
		Customer anna = queue1.poll();
		Customer paulo = queue1.poll();
		
		System.out.println(anna);
		System.out.println(paulo.getName());
		//------------------Adding-------------
		System.out.println("--- Secund parte. Adding");
		
		//Using "ADD" will throw an exception if the list is full
		Queue<Customer> queue2 = new ArrayDeque<>();
		queue2.add(new Customer("Pedro"));
		queue2.add(new Customer("Thamires"));
		System.out.println(queue2);
		System.out.println("--With lambda");
		queue2.forEach(c -> {
			System.out.println(c);
		});
		
		//Using OFFER, that just return NULL when the list is full
		Queue<Customer> queue3 = new ArrayDeque<>();
		queue3.add(new Customer("Pedro"));
		queue3.add(new Customer("Thamires"));
		
		queue3.clear();
		
		
	}

}
