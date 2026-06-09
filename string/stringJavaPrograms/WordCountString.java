package string.stringJavaPrograms;

public class WordCountString {
	public static void main(String[] args) {
		String str="India is a sub continent";
		String[] str1=str.split(" ");
		int count=0;
		for (int i = 0; i < str1.length; i++) 
		{
			count+=1;
		}
		System.out.println("The total number of words "+count);
	}

}
