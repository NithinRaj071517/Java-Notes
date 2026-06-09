package map.syntax_Access;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCreationAndAccess {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		hmap.put(1, "Nithin");
		hmap.put(2, "Raj");
		hmap.put(3, "Shain");
		hmap.put(8, "Levis");
		hmap.put(5, "Thiru");
		hmap.put(6, "Kumar");
		hmap.put(null, "Vel");
		hmap.put(6, "KumarG");
		System.out.println(hmap);
		
		//To check contains key in map
		
		System.out.println("<!---------------To check contains key in map------------->");
		boolean keys=hmap.containsKey(5);
		System.out.println(keys);
		System.out.println(hmap.containsKey(12));
		
		//To check contains values in map
		
		System.out.println("<!---------------To check contains values in map------------->");
		boolean vals=hmap.containsValue("Raj");
		System.out.println(vals);
		System.out.println(hmap.containsValue("nithin"));
		System.out.println(hmap.containsValue("Sekar"));
		
		
		//Copy the Map using putAll
		System.out.println("<!---------------Copy map using PutAll------------->");
		HashMap<Integer,String> dupMap = new HashMap<Integer,String>();
		dupMap.putAll(hmap);  // copy all values from old to new
		System.out.println(dupMap);
		
		//Copy the Map using clone
		System.out.println("<!---------------Copy map using Clone------------->");
		System.out.println(hmap.clone());
		
		
		//Clear the maps values
		dupMap.clear();  // clear all values 
		System.out.println(dupMap);
		
		
		//Checks Map is empty 
		boolean emp=dupMap.isEmpty();
		System.out.println(emp);
		
		boolean emp1=hmap.isEmpty();
		System.out.println(emp1);
		
		//Retrieve all keys alone in Map
		Set<Integer> keylist=hmap.keySet();
		System.out.println(keylist);
		

		
		//Retrieve all paired values in Map
		System.out.println("<!----------Entry set--------!>");
		Set<Entry<Integer, String>> keylist1=hmap.entrySet();
		System.out.println(keylist1);
		
		
		//To get the value based on key
		System.out.println(hmap.get(3));
		
	}
}
