package collection.List.syntax_Access;


import java.util.LinkedList;

import java.util.ListIterator;

public class LinkedListIteration {

	public static void main(String[] args) {
		
		LinkedList<String> fruits=new LinkedList<String>();
		
		fruits.add("Banana");
		fruits.add("Guava");
		fruits.add("Apple");
		fruits.add("Fig");
		fruits.add("Grapes");
		fruits.add("WaterMelon");
		fruits.add("Custard");
		
		System.out.println(fruits);
	
		
		System.out.println("Type-1");
		System.out.println("<!------------------------For Loop----------------!>");
		
		for (int i = 0; i < fruits.size(); i++) 
		{
			System.out.println("           "+fruits.get(i));
			
		}
		
		
		
		System.out.println("Type-2");
		System.out.println("<!------------------------For Each----------------!>");
		for(String str:fruits)
		{
			System.out.println("           "+str);
		}
		
		
		
	
		
		System.out.println("Type-3");
		System.out.println("<!------------------------List Iterator----------------!>");
		System.out.println("<!------------------------Forward List Iterator----------------!>");
		ListIterator<String> iterator = fruits.listIterator();
		
		
		while(iterator.hasNext())
		{
			System.out.println("           "+iterator.next());
		}
		
		System.out.println("<!------------------------Backward List Iterator----------------!>");
		while(iterator.hasPrevious())
		{
			System.out.println("           "+iterator.previous());
		}
	}
}
