package collections.set;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class SetTrain {

	public static void main(String[] args) {
		//Unordered collection of unique elements
		
		Set<String> set = new HashSet<>();
		
		set.add("First object");
		set.add("Second object");
		set.add("Third object");
		
		System.out.println(set);
		
		System.out.println("---Interacting over the set");
		set.forEach(element -> {
			System.out.println(element);
		});
		
		//Removing
		set.remove("First object");
		System.out.println("--- Removing");
		set.forEach(element -> {
			System.out.println(element);
		});
		
		//Adding
		set.addAll(Set.of("1", "2", "3"));
		System.out.println("--- Adding");
		set.forEach(element -> {
			System.out.println(element);
		});
		
		
	}

}
