package map.syntax_Access;

import java.util.HashMap;
import java.util.LinkedHashMap;


public class LinkedHashMapCreationAndAccess {

	public static void main(String[] args) {
		
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		
		hmap.put(1, "Nithin");
		hmap.put(2, "Raj");
		hmap.put(3, "Shain");
		hmap.put(8, "Levis");
		hmap.put(5, "Thiru");
		hmap.put(6, "Kumar");
		hmap.put(7, "Vel");
		hmap.put(5, "Guru");
		System.out.println(hmap);
		
		LinkedHashMap<Integer,String> lhmap = new LinkedHashMap<Integer,String>();
		
		lhmap.put(1, "Nithin");
		lhmap.put(2, "Raj");
		lhmap.put(3, "Shain");
		lhmap.put(8, "Levis");
		lhmap.put(5, "Thiru");
		lhmap.put(6, "Kumar");
		lhmap.put(7, "Vel");
		lhmap.put(5, "Guru");
		System.out.println(lhmap);

	}
}
