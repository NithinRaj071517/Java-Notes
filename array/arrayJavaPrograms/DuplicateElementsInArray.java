package array.arrayJavaPrograms;



public class DuplicateElementsInArray {

	
	public static void main(String[] args) {
		
		int a[]= {2,4,6,7,8,7,4,3,5,9,6,6};

		for (int i = 0; i < a.length; i++) 
		{
			for (int j = i+1; j < a.length; j++) 
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]+" ");
						
				}
			}
		}
		
		
	}
}
