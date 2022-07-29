package collections.conversions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Conversions {
	public static void main(String[] args) {
		
		//Set to a List
		Set<String> set = new HashSet<>();
		
		set.add("First object");
		set.add("Second object");
		set.add("Third object");
		
		List<String> list = new ArrayList<>();
		list.addAll(set);
		
		list.forEach(e -> {
			System.out.println(e);
		});
		
		
		

	}
	
}
