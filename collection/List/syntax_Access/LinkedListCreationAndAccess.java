package collection.List.syntax_Access;

import java.util.LinkedList;


public class LinkedListCreationAndAccess {

	public static void main(String[] args) {
		
		
		LinkedList<Integer> linked = new LinkedList<Integer>();
		
		System.out.println("<!-------------------Add----------->");
		//To add values in LinkedList
		linked.add(100);
		linked.add(120);
		linked.add(160);
		linked.add(150);
		linked.add(450);
		linked.add(null);
		linked.add(150);
		linked.add(190);
		linked.add(160);
		linked.add(150);
		linked.add(450);
		linked.add(null);
		linked.add(150);
		linked.add(190);
		linked.add(160);
		linked.add(190);
		System.out.println(linked);
		
		linked.addFirst(620); //Add value first 
		System.out.println(linked);
		linked.addLast(320); //Add value Last
		System.out.println(linked);
		
		System.out.println("<!-------------------Get----------->");
		
		System.out.println(linked.get(4)); //Get  value of particular index
		System.out.println(linked.get(0));
		System.out.println(linked.getFirst());  //Get  value of first index
		System.out.println(linked.getLast()); //Get  value of last index
		
		
		
		System.out.println("<!-------------------Remove----------->");
		System.out.println(linked.removeFirst()); //Remove first element
		System.out.println(linked);
		System.out.println(linked.removeLast()); //Remove last element
		System.out.println(linked);
		System.out.println(linked.remove(4)); //Remove particular index element
		System.out.println(linked);
		System.out.println(linked.removeFirstOccurrence(150));  //Remove first occurrence of the particular element
		System.out.println(linked);
		System.out.println(linked.removeLastOccurrence(160));  //Remove last occurrence of the particular element
		System.out.println(linked);
		
		System.out.println("<!-------------------Poll----------->");
		System.out.println(linked.poll()); //Remove first element
		System.out.println(linked);
		System.out.println(linked.pollFirst()); //Remove first element
		System.out.println(linked);
		System.out.println(linked.pollLast());//Remove last element
		System.out.println(linked);

	}
}
