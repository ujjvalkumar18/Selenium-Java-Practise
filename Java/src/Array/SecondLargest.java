package Array;

public class SecondLargest {

	public static void main(String[] args) {

		int arr[] = { 10, 12, 18, 20, 22 };
		int largest = arr[0];
		int secondlargest = arr[0];
		System.out.println("Elements of given array are");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondlargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondlargest) {
				secondlargest = arr[i];
			}
		}
		
		System.out.println("second Largest no is " + secondlargest);	
	}
	

}
