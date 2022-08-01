package iterator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Example1 {
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Pedro");
		list.add("Victor");
		list.add("Raquel");
		
		Iterator<String> iterator = list.iterator();
		
		Set<String> set = new HashSet<>();
		set.add("Luisa");
		set.add("Thamires");
		set.add("Andre");
		
		Iterator<String> iterator2 = set.iterator();
		  
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Ferrari");
		map.put(2, "Porsche");
		
		 Iterator<Integer> keyIterator = map.keySet().iterator();
		 Iterator<String> valueIterator = map.values().iterator();
		 
		 Iterator<Map.Entry<Integer, String>> entryIterator = map.entrySet().iterator();
		 
	}

}
