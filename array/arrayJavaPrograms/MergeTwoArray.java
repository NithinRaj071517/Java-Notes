package array.arrayJavaPrograms;

import java.util.Arrays;

public class MergeTwoArray {
	public static void main(String[] args) {
		
		/**
		 Using nested for loop merging two array.
		 1. Creating new array with length of a and b as C.
		 2. Loop a array add it in c
		 3. Loop b array add it in c
		 4. While looping b it should be c[j+a.length] because it will add after a array
		 
		 **/
		
		int[] a= {1,2,3,5,6,7,4};
		int[] b= {4,5,6,7,5,5};
		int[] c= new int[a.length+b.length];
		
		for (int i = 0; i < a.length; i++) 
		{
			c[i]=a[i];
		}
		//System.out.println(Arrays.toString(c));
		for (int j = 0; j < b.length; j++) 
		{
			c[j+a.length]=b[j];
		}
		
		System.out.println(Arrays.toString(c));
	}

}
