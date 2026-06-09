package collection.set.syntax_Access;



import java.util.LinkedHashSet;


public class LinkedHashSetCreationAndAccess {
	public static void main(String[] args) {

		LinkedHashSet<String> hs=new LinkedHashSet<String>();
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
		
		for(String st:hs)
		{
			System.out.println(st);
		}
	}

}
