package string.stringJavaPrograms;

import java.util.Scanner;

public class ReverseAStringS {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String word = input.nextLine();
        
		StringBuilder reversed = new StringBuilder(word);
		System.out.println(reversed.reverse().toString());
		
		StringBuffer reversed1=new StringBuffer(word);
		System.out.println(reversed1.reverse().toString());
	}

}
