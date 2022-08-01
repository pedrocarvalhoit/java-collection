package iterator;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
	public static void main(String[] args) {

		List<String> list = new LinkedList<>();
		list.add("Hanna");
		list.add("Marilia");
		list.add("Mendonca");
		
		System.out.println("---");
		ListIterator<String> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
		System.out.println("---");
		while(listIterator.hasPrevious()) {
			System.out.println(listIterator.previous());
		}

	}

}
