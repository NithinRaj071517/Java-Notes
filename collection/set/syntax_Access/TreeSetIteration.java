package collection.set.syntax_Access;



import java.util.Iterator;
import java.util.TreeSet;


public class TreeSetIteration {

	public static void main(String[] args) {
		
		TreeSet<String> fruits= new TreeSet<String>();
		
		
		
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
		System.out.println("<!------------------------Iterator Ascending----------------!>");
		Iterator<String> iteratorSet = fruits.iterator();
		while(iteratorSet.hasNext())
		{
			System.out.println("           "+iteratorSet.next());
		}

		
		System.out.println("Type-3");
		System.out.println("<!------------------------Iterator descending----------------!>");
		Iterator<String> iteratorDescSet = fruits.descendingIterator();
		while(iteratorDescSet.hasNext())
		{
			System.out.println("           "+iteratorDescSet.next());
		}

		
		
	}
}
