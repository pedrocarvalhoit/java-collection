package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTrain {
public static void main(String[] args) {
		
		List<String> myList = new LinkedList();
		myList.add("Object 1");
		myList.add("Object 2");
		myList.add("Object 3");
		
		//	myList.remove(2);
		
		//Cast needed to creat a variable when the List has no String specification
		String firstObjecti = (String) myList.get(0);
		
		//Printing Linked List
		Iterator iterator = myList.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		System.out.println("-- foreach--");
		for (Object next : myList) {
			System.out.println(next);
		}
		
		System.out.println("-- Lambda--");
		myList.forEach(next -> {
			System.out.println(next);
		});
		
		//Chaging a object from the list
		System.out.println("--New List");
		myList.set(0, "Nova lista Object 1");
		//Nova lista
		System.out.println("-- Lambda--");
		myList.forEach(next -> {
			System.out.println(next);
		});
		
		//Creating a subList
		List<String> subList = myList.subList(1, 2);
		
		myList.clear();
		
	}

}
