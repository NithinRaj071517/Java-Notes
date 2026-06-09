package array.arrayJavaPrograms;

public class SecondLargestElement {

	public static void main(String[] args) {
		int[] arr= {98,6,2,28,99,99,34,12};
		int max= arr[0];
		int secondMAx=arr[0];
		for (int i = 0; i < arr.length; i++) 
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {


			if (arr[i] > secondMAx && arr[i] != max) 
			{
				secondMAx = arr[i];
			}
		}
		System.out.println(secondMAx);
	}
}
