package iterable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class IterableExample {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		
		Collection<String> collections = list;
		Iterable<String> iterable = collections;
		
		iterable.forEach(e -> {
			System.out.println(e);
		});
		
	
		
	}

}
