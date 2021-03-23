package CollectionsConcepts;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {

	public static void main(String[] args) {
		Stack<String>stack=new Stack<String>();
		//add the element Using add Method 
		stack.add("Decaprio");
		stack.add("Tom Hanks");
		stack.add("Johny Depp");
		stack.add("Will Smith");
		stack.add("Andy");
		
		//add the Element Using addElement Method
		stack.addElement("Morgan");
		
		// To be check the value using Contains Method
		boolean contains = stack.contains("Andy");
		System.out.println("Its Contained The Given Value " +contains);
		
		//to check Empty or Not
		boolean empty = stack.empty();
		System.out.println("Stack is Not Empty "  +empty);
		
		//Set the Element Particular place Using setElement
		stack.setElementAt("Richard", 4);
		
		// To be Search the Given value
		int search = stack.search("Andy");
		System.out.println("Search The Elements "  +search);
		
		//to be check size of the value
		int size = stack.size();
		System.out.println("Total size of Element " +size);
		//To be print All The values Using iterator
		Iterator<String> iterator = stack.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		//remove the Element
		String remove = stack.remove(2);
		System.out.println("After removed the element " +remove);
		
		//to check equal or Not
		boolean equals = stack.equals(iterator);
		System.out.println("Equal Element " +equals);
		
		//To be Print Capacity Value 
				int capacity = stack.capacity();
				System.out.println("Capacity value is:" +capacity);
		// Using Peek Method will print first Value
		
		 String peek = stack.peek(); 
		 System.out.println("Peek Methods Print the Value:" +peek);
		
		// Using POll Method will print first Value
			
			 String pop = stack.pop(); 
			 System.out.println("Pop Methods Print the Value:" +pop);
			
	}
}
