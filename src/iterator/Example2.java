package iterator;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Example2 {
	
	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		list.add("Hanna");
		list.add("Marilia");
		list.add("Mendonca");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
			iterator.remove();
		}
		System.out.println(list.size());
		
	}

}
