package array.arrayJavaPrograms;


import java.util.stream.IntStream;

public class FIndAnElementInArray {

	
	/**
	 Using  for loop to find element in an array.
	 1. Creating new array with length of a and b as C.
	 2. Loop each element if the target element received , change found to true
	 
	 **/
	public void findElementUsingLoop(int[] arr1,int target) 
	{
		
		
		boolean found=false;
		for (int i = 0; i < arr1.length; i++) 
		{
			if(arr1[i]==target)
			{
				found=true;
				break;
			}
		}
		
		if(found==true)
		{
			System.out.println(target+" Number Present");
		}
		else
		{
			System.out.println(target+" Not Present");
		}
		
		
		
	}
	/**
	 Using  for IntStream function to find element in an array.
	 
	 
	 **/
	public void findElementUsingStream(int[] arr1,int target) 
	{
		boolean anyMatch = IntStream.of(arr1).anyMatch(ele->ele==target);

		if(anyMatch==true)
		{
			System.out.println(target+" Number Present");
		}
		else
		{
			System.out.println(target+" Not Present");
		}
	}
	
	public static void main(String[] args) {
		int[] arr1= {1,5,23,33,55,336,984};
		int target=336;
		FIndAnElementInArray obj=new FIndAnElementInArray();
		obj.findElementUsingLoop(arr1,target);
		obj.findElementUsingStream(arr1,target);
	}
}
