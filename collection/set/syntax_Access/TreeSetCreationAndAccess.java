package collection.set.syntax_Access;



import java.util.TreeSet;


public class TreeSetCreationAndAccess {
	public static void main(String[] args) {
TreeSet<String> tree= new TreeSet<String>();
		
		//To add values in ArrayList
		tree.add("Zuruti");
		tree.add("Honda");
		tree.add("Benz");
		tree.add("Hyundai");
		tree.add("Audi");
		tree.add("Benz");
		tree.add("Mahindra");
		System.out.println(tree);
		
		
		System.out.println(tree.first());
		System.out.println(tree.last());
		System.out.println(tree.headSet("Benz")); //display before values
		System.out.println(tree.tailSet("Honda")); //display after values include specify values
		System.out.println(tree.subSet("Hyundai","Zuruti")); //display in between values including first values but not values
		System.out.println(tree.comparator()); //Returns null if it is in default natural order
		System.out.println(tree.higher("Honda")); //Next higher value 
		System.out.println(tree.lower("Hyundai")); // Previous lower value
		System.out.println(tree.pollFirst()); // removes first
		System.out.println(tree.pollLast()); // removes last
		System.out.println("After Polling - "+tree);
		System.out.println("Descending order - "+tree.descendingSet()); // descending order
	}

}
