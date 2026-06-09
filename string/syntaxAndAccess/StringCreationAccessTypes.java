package string.syntaxAndAccess;

public class StringCreationAccessTypes {

	public static void main(String[] args) 
	{
		String name="TestLeaf";  //By using  String Literal
		String fed=new String("TestLeaf"); //By using "new" keyword --> String Object
		int number=345;
		System.out.println(name);
		System.out.println(fed);
		
		String sample="Nithin Raj";
		String test=" great thanks ";
		//returns character value for the particular index
		System.out.println(sample.charAt(3));
		
		//returns string length
		System.out.println(sample.length());
		
		//check the equality of string with the given object
		System.out.println(sample.equals("Nithin Raj")); //return true
		System.out.println(sample.equals("Nithin raj")); //return false
		
		//check the equality of string with the given object without case sensitivity
		System.out.println(sample.equalsIgnoreCase("Nithin Raj")); //return true
		System.out.println(sample.equalsIgnoreCase("Nithin raj")); //return true
		
		//checks if string is Empty or not
		System.out.println(sample.isEmpty());
		System.out.println(test.isEmpty());

		//return true or false based on given value present or not
		System.out.println(sample.contains("j"));
		System.out.println(sample.contains("J"));
		System.out.println(sample.contains("s"));
		
		//Take from the particular position of a string
		System.out.println(sample.substring(4));
		System.out.println(sample.substring(7));
		
		//Take from the particular position of a string from start and end index, end index not include
		System.out.println(sample.substring(4,6));
		System.out.println(sample.substring(7,10));
		
		
		//appends the string to the string
		System.out.println(sample.concat("Gud boy"));
		System.out.println(sample+sample);
		
		//replace the existing char with given char
		System.out.println(sample.replace("j", "g"));
		System.out.println(sample.replace("Raj", "gaR"));
		
		 
		//find the position of the char in string
		System.out.println(sample.indexOf("f"));
		System.out.println(sample.indexOf("i")); //first occurrences
		
		//finds the char specified from the index position
		System.out.println(sample.indexOf("i",3));
		
		//trim the whitespace before and after
		System.out.println(test.trim());
		System.out.println(test);
		
		//Convert the given data type to string
		System.out.println(String.valueOf(number));
		
		//Convert into Upper case & lower case
		String lowercase="nithin";
		String uppercase="RAJ";
		System.out.println(lowercase.toUpperCase());
		System.out.println(uppercase.toLowerCase());
		
		
		//Returns a joined String with given delimiter
		System.out.println(String.join("@ ","My","name","Nithin"));
		System.out.println(String.join("/","15","01","1998"));
		
		//Split
		String splitIt="Yaara Intha Paiyan Naan antha Paiyan";
		String[] str = splitIt.split("a");
		for(String s1:str)
		{
			System.out.println(s1);
		}
				
		System.out.println("---------------------------------------------------");
		System.out.println("---------String Buffer-------------------");
		
		String nobuffer="Nithin";
		System.out.println(nobuffer.concat("Raj"));
		System.out.println(nobuffer);
		
		StringBuffer buffer1=new StringBuffer("Nithin");
		System.out.println(buffer1.append("Rajjj"));
		System.out.println(buffer1);
		
		
		System.out.println("---------------------------------------------------");
		System.out.println("---------String Buffer Methods-------------------");
		
		StringBuffer type=new StringBuffer("MyilSwamy");
		System.out.println("Reversed text :"+type.reverse());
		
		StringBuffer replaceText=new StringBuffer("Wilson");
		System.out.println("replaced text :"+replaceText.replace(0, 3, "John"));
		
		StringBuffer deleteText=new StringBuffer("Daniel");
		System.out.println("deleted text :"+deleteText.delete(0, 3));
		
		StringBuffer insertText=new StringBuffer("Arun");
		System.out.println("Inserted text :"+insertText.insert(4, "Pandiyan"));
		
		System.out.println(deleteText.capacity());
		
	}
}
