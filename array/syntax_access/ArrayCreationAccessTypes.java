package array.syntax_access;

import java.util.stream.Stream;

public class ArrayCreationAccessTypes {
	
	public static void main(String[] args) {
		
		//Creation Approach-1
		
		int[] arr1=new int[3];
		arr1[0]=101;
		arr1[1]=102;
		arr1[2]=103;
		System.out.println(arr1.length);
		//Creation Approach-2
		String[] arr2= {"Nithin","raj","nk"};
		System.out.println(arr2);
		
		
		//Accessing method-1
		System.out.println("-------------Method1----------");
		for (int i = 0; i < arr2.length; i++) 
		{
			System.out.println(arr2[i]);
		}
		
		
		//Accessing method-2
		System.out.println("-------------Method2----------");
		for (String name : arr2) 
		{
			System.out.println(name);
		}
		
		//Accessing method-3
		System.out.println("<-------------Method3---------->");
		Stream.of(arr2).forEach(na -> System.out.println(na));
		
		//ReverseOrder
		System.out.println("<-------------ReverseOrder---------->");
		for (int i = arr2.length-1; i>=0; i--) 
		{
			System.out.println(arr2[i]);
		}
		
		
		//ReverseOrder
		System.out.println("<-------------MultiDimensional array-------->");
		int[][] marry=new int[2][2];
		marry[0][0]=1;
		marry[0][1]=2;
		marry[1][0]=3;
		marry[1][1]=4;
		
		for (int i = 0; i < marry.length; i++) 
		{
			for (int j = 0; j < marry.length; j++) 
			{
				System.out.println(marry[i][j]);
			}
			
		}
		
	}

}
