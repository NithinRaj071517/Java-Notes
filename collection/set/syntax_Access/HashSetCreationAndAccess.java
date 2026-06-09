package collection.set.syntax_Access;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetCreationAndAccess {
	public static void main(String[] args) {
List<String> arrList= new ArrayList<String>();
		
		//To add values in ArrayList
		arrList.add("Maruti");
		arrList.add("Honda");
		arrList.add("Benz");
		arrList.add("Hyundai");
		arrList.add("Audi");
		arrList.add("Benz");
		arrList.add(null);
		arrList.add("Mahindra");
		System.out.println(arrList);
		
		
		//Can add List to Set 
		HashSet<String> hs1=new HashSet<String>(arrList);
		System.out.println(hs1);
		
		/**
		 * HashSet Methods
		 * 
		 */
		HashSet<String> hs=new HashSet<String>();
		hs.add("Nithin");
		hs.add("Akash");
		hs.add("Lokesh");
		hs.add(null);
		hs.add("Raghu");
		hs.add("Raj");
		hs.add("kumar");
		hs.add(null);
		hs.add(null);
		hs.add("Raghu");
		hs.add("Raj");
		System.out.println(hs);
		
		boolean containsAll = hs1.containsAll(arrList);
		System.out.println(containsAll);
	}

}
