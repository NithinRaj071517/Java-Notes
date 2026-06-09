package collection.set.syntax_Access;


import java.util.HashSet;
import java.util.Iterator;


public class HashSetIteration {

	public static void main(String[] args) {
		
		HashSet<String> fruits= new HashSet<String>();
		
		
		
		fruits.add("Banana");
		fruits.add("Guava");
		fruits.add("Apple");
		fruits.add("Fig");
		fruits.add("Grapes");
		fruits.add("WaterMelon");
		fruits.add("Custard");
		
		System.out.println(fruits);
	
		
		
		System.out.println("Type-1");
		System.out.println("<!------------------------For Each----------------!>");
		for(String str:fruits)
		{
			System.out.println("           "+str);
		}
		
		
		
		System.out.println("Type-2");
		System.out.println("<!------------------------Iterator----------------!>");
		Iterator<String> iteratorSet = fruits.iterator();
		while(iteratorSet.hasNext())
		{
			System.out.println("           "+iteratorSet.next());
		}

		
		
	}
}
