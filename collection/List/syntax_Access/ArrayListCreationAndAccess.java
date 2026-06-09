package collection.List.syntax_Access;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCreationAndAccess {
	
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
		arrList.add(null);
		System.out.println(arrList);
		
		//To add values in particular index
		arrList.add(7,"BMW");
		System.out.println(arrList);
	
		//Provide the size
		
		System.out.println(arrList.size());
		
		
		
		//To get values from  ArrayList
		System.out.println(arrList.get(3)); //Provides the value 
		System.out.println(arrList.indexOf("Audi")); //Provides the index value
		System.out.println(arrList.indexOf("Benz"));  //Provide first occurrence
		System.out.println(arrList.lastIndexOf("Benz")); //Provide Last occurrence
		
		//Copy entire ArrayList to another
		List<String> arrList2=new ArrayList<String>();
		arrList2.addAll(arrList);
		System.out.println(arrList2);
		
		
		//Delete entire list
		arrList2.clear();
		System.out.println(arrList2);
		
		//Removing particular values 
		arrList.remove(2);  //Removes based on index
		System.out.println(arrList);
		arrList.remove("Hyundai"); //Removes based on values
		System.out.println(arrList); 
		
		//Setting/Replacing the value in arrayList
		
		arrList.set(4, "Toyota");  //Replaces the value 
		System.out.println(arrList);
		
		//Returns true if ArrayList is empty
		System.out.println(arrList2.isEmpty());
		System.out.println(arrList.isEmpty());
		
		
		
	}

}
