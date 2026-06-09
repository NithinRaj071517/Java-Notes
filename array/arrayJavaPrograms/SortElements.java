package array.arrayJavaPrograms;

import java.util.Arrays;

public class SortElements {

	public static void main(String[] args) {
		
		
		/**
		Method-1 Using nested for  loop iterating 
		**/
		int[] s = {-2,7, 5,0, 1, 3, -1, 2};
				
		int t=0;
		for (int i = 0; i < s.length; i++) 
		{
			for (int j = i+1; j < s.length; j++) 
			{
				if(s[i]>s[j])
				{
					t=s[i];
					s[i]=s[j];
					s[j]=t;
				}
			
			}
		System.out.print(s[i]+" ");
			
		}
		
		System.out.println();
		/**
		Method-2 Using Array function SORT and use toString function to display values
		**/
		int[] sf = { 3,4,5,-2, 0, 1, 3, -1, 2,-4 };
		Arrays.sort(sf);
	
		System.out.println(Arrays.toString(sf));
		
		
		
	}
}
