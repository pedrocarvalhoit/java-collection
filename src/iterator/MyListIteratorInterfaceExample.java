package iterator;

import java.util.ArrayList;
import java.util.List;

public class MyListIteratorInterfaceExample {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		
		MyListIteratorInterface<String> iterator = new MyListIteratorInterface<>(list);
	/*	while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}*/
		
		//Better way to print the iterator
		iterator.forEachRemaining(e -> {
			System.out.println(e);
		});

	}

}
