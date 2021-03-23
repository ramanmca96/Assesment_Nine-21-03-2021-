package CollectionsConcepts;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeExample {
	public static void main(String[] args) {
		Deque<String>queue=new ArrayDeque<String>();
		//add The element Using add Method
		queue.add("Java");
		queue.add("SQL");
		queue.add("Selenium");
		queue.add("Python");
		
		// add the element addFirst Method
		queue.addFirst("C");
		
		// add the element addLast Method
		
		queue.addLast("Ruby");
		
		//iterate the element
		Iterator<String> iterator = queue.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
		
		//Empty Methods
		boolean empty = queue.isEmpty();
		System.out.println("Empty Methods:" +empty);
		
		//To be find the value of Size 
		int size = queue.size();
		System.out.println("Size of Queue is:" +size);
		
		//push The Value using Push Method
		queue.push("Java Spring Boot");
		
		//pop method help to print what we are passed in push Method
		String pop = queue.pop();
		System.out.println("Pop Method :" +pop);
		
		//Poll Method help to print first Value and deleted it
		String poll = queue.poll();
		System.out.println("Poll Method help to print first Value " +poll);
		
		//Will print Top of the Value
		String peek = queue.peek();
		System.out.println("Peek Methods :" +peek);
		
		//remove the last value
		String removeLast = queue.removeLast();
		System.out.println("Removed Last Methods:" +removeLast);
		
		//Poll First Method
		String pollFirst = queue.pollFirst();
		System.out.println("Poll First Method :" +pollFirst);
		
		//poll Last Methods
		String pollLast = queue.pollLast();
		System.out.println("Poll Last Methods :" +pollLast);
		
		String peekFirst = queue.peekFirst();
		System.out.println("Peek First :" +peekFirst);
		
		String peekLast = queue.peekLast();
		System.out.println("Peek Last Methods: " +peekLast);
		
		boolean contains = queue.contains("Selenium");
		System.out.println("Contains Method : " +contains);
		
		Iterator<String> descendingIterator = queue.descendingIterator();
		while (descendingIterator.hasNext()) {
			String string = (String) descendingIterator.next();
			System.out.println("Descending Order:" +string);
			
			
		}
	}
	
}
