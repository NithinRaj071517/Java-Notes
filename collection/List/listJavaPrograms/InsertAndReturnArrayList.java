package collection.List.listJavaPrograms;

import java.util.ArrayList;

import java.util.List;

public class InsertAndReturnArrayList {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4};
		List<Integer> arrList=new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) 
		{
			arrList.add(arr[i]);
		}
		
		System.out.println(arrList);
		
		
		
		
	}

}
