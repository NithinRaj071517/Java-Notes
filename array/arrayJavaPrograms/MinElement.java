package array.arrayJavaPrograms;

import java.util.Arrays;

public class MinElement {

	public static void main(String[] args) {
		
		/**
		Method-1 Using for loop iterating each element from the array comparing with MAX ,
		if element is greater than MAX ,will replace the MAX value
		**/
		int[] a= {43,6,2,28,9,34,12};
		int min=a[0];
		for (int i = 0; i < a.length; i++) 
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println(min);
		
		/**
		Method-2 Using for Array function SORT, it will sort  in ascending order
		Then Print the last element using length-1
		**/
		int[] b= {76,33,34,55,6,3,44,5};
		Arrays.sort(b);
		System.out.println(b[0]);
		
		
	}
}
