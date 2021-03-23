package CollectionsConcepts;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class VectorExample {
	public static void main(String[] args) {
		Vector<String>vector=new Vector<String>();
		Vector<String>VecClone=new Vector<String>();
		vector.add("Java");
		vector.add("Selenium");
		vector.add("Python");
		vector.add("JavaSpringBoot");
		vector.add("SQL");
		
		//iterator the values
		Iterator<String> iterator = vector.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		//Add the Element Using addElement Method
		vector.addElement("Ruby");
		System.out.println(vector);
		
		//to be Print First Element
		String firstElement = vector.firstElement();
		System.out.println("First Element:" +firstElement);
		
		//to be Print Last Element
		String lastElement = vector.lastElement();
		System.out.println("First Element:" +lastElement);
		
		
		//Clone The Elements
		VecClone =(Vector)vector.clone();
		
		System.out.println("After Clone:");
		
			for (String string : VecClone) {
		System.out.println(string);
	}	
	
		//To be Check Capacity
		int capacity = vector.capacity();
		System.out.println("Capacity is :" +capacity);
		
		
		//remove the Element Particular location
		String remove = vector.remove(3);
		System.out.println("Removed Element:" +remove);
		vector.ensureCapacity(10);
		
		
		//To be Check Contains Method
		boolean contains = VecClone.contains("Jav");
		System.out.println(contains);
		
		// To be Check Given Element Empty or Not
		boolean empty = vector.isEmpty();
		System.out.println(empty);
		
		
		vector.insertElementAt("Android", 5);
		
		for (String string : vector) {
			System.out.println(string);
		}
		
		// Add all element to another
		Vector<String>vee=new Vector<String>();
		vee.addAll(vector);
		
		System.out.println("After Added Element" +vee);
		vector.clear();
		

		
		
	}
	
}
