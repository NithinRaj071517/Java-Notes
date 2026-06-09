package string.stringJavaPrograms;



public class PallindromeString {
	
	public String negativeForLoop(String s1) 
	{
		String rev="";
		for (int i = s1.length()-1; i >=0; i--) 
		{
			rev=rev+s1.charAt(i);
			
		}
		
		
		if(s1.equalsIgnoreCase(rev))
		{
			return "Pallindrome";
			
		}
		return "Not Pallindrome";
		
	}
	public String PositiveForLoop(String s1) 
	{
		String rev="";
		for (int i = 0; i < s1.length(); i++) 
		{
			rev=s1.charAt(i)+rev;
		}
		if(s1.equalsIgnoreCase(rev))
		{
			return "Pallindrome";
			
		}
		return "Not Pallindrome";
		
	}
	
	public String stringBuilder(String s1) 
	{
		StringBuilder builder=new StringBuilder(s1);
		String s2=builder.reverse().toString();
		
		if(s1.equalsIgnoreCase(s2))
		{
			return "Pallindrome";
		}
		return "Not Pallindrome";
	}
	
	
	
	
	public static void main(String[] args) {
		PallindromeString obj=new PallindromeString();
		String sample="Nitin";
		
		/**Method -1 
		Looping the char from end to beginning 
		Adding to empty string 
		Then compare with original one
		**/
		String negativeLoop = obj.negativeForLoop(sample);
		System.out.println(negativeLoop);
		
		/**Method -2 
		Looping the char from start to end  
		Pre appending to the  empty string 
		Then compare with original one
		**/
		String positiveLoop = obj.PositiveForLoop(sample);
		System.out.println(positiveLoop);
		
		/**Method -3
		Using String builder or buffer
		**/
		String stringBuild=obj.stringBuilder(sample);
		System.out.println(stringBuild);
		

				
	}

}
