package CollectionsConcepts;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample  {
	public static void main(String[] args) {
		
		LinkedHashMap<Integer, Integer> map=new LinkedHashMap();
		LinkedHashMap<Integer, Integer> hamap=new LinkedHashMap();
		//add element using put method
		map.put(10, 100);
		map.put(20, 200);
		map.put(30, 300);
		map.put(40, 400);
		map.put(null, null);
		map.put(null, null);
		
		//entryset method help to set out of element
		Set<Entry<Integer,Integer>> entrySet = map.entrySet();
		for (Entry<Integer, Integer> entry : entrySet) {
			System.out.println(entry);
		}
		//to be print key alone
		System.out.println("Keys :" +map.keySet());
		
		// To be Print values Alone
		System.out.println("Values :" +map.values());
		
		//To be Check Empty or Not
		boolean empty = map.isEmpty();
		System.out.println("To check Empty Metho:" +empty);
		
		int size = map.size();
		System.out.println("Size of the value:" +size);
		
		Integer replace = map.replace(40, 50);
		System.out.println("replace Methods: " +replace);
		
		Integer putIfAbsent = map.putIfAbsent(30, 25);
		System.out.println("putIfAbsent Method :" +putIfAbsent);
		
		Integer remove = map.remove(20);
		System.out.println("removed the element :" +remove);
		
		Set<Entry<Integer,Integer>> entrySet2 = map.entrySet();
		System.out.println(entrySet2);
		
		
		hamap.put(50, 500);
		hamap.put(60, 600);
		// put all method to add two more linkedHashmap
		hamap.putAll(map);
		System.out.println(hamap);
		
		//to be print Size of element
		int size2 = hamap.size();
		System.out.println("After the size of element:" +size2);
		
		//to be check Contains Method
		boolean containsKey = hamap.containsKey(30);
		System.out.println("Keys are :" +containsKey);
		boolean containsValue = hamap.containsValue(300);
		System.out.println("Values are:" +containsValue);
}
}