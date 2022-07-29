package collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTrain {
	public static void main(String[] args) {
		
		Map<String, String> map = new HashMap<>();
		
		Customer customer1 = new Customer("123", "Pedro Duarte");
		Customer customer2 = new Customer("321", "Victor Duarte");
		
		map.put(customer1.getCustomerID(), customer1.getName());
		map.put(customer2.getCustomerID(), customer2.getName());
		
		System.out.println(map);
		
 		Order order = new Order(customer1.getCustomerID());
 		
 		String customerForOrder = map.get(order.getCustomerID());
 		
 		System.out.println(customerForOrder );
 		
 		//Exemple 2
 		Map<String, Integer> map2 = new HashMap<>();
 		map2.put("abc", Integer.valueOf(123));
 		map2.put("cba", 789);
 		System.out.println(map2);
 		
 		//Putting one Map inside another one
 		Map<String, Integer> map3 = new HashMap<>();
 		map3.putAll(map2);
 		System.out.println(map3);
 		
 		//ForEach loop
 		System.out.println("---Foreach");
 		for(String key: map3.keySet()) {
 			System.out.println(key);
 			System.out.println(map3.get(key));
 		}
 		
 		//Checking if map contains
 		System.out.println("---Contains");
 		System.out.println(map.containsKey("123"));
 		System.out.println(map.containsValue("Pedro Duarte"));
 		
	}

}
