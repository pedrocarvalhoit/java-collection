package collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTrain {
	public static void main(String[] args) {
		
		List<String> myList = new ArrayList<>();
		myList.add("Object 1");
		myList.add("Object 2");
		myList.add("Object 3");
		
		//	myList.remove(2);
		
		//Cast needed to creat a variable when the List has no String specification
		String firstObjecti = (String) myList.get(0);
		
		//Printing Array
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
		
		myList.clear();
		
	}

}
