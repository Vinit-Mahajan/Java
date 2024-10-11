import java.util.*;
class BubbleSort {

	public static void main(String[] args) {
	
		int arr[] = new int[] {1,2,3,4,5};
		int count = 0;

		/*   //Approach :1

		for(int i = 0 ; i < arr.length; i++) {
		
			for(int j = 0; j < arr.length-1 ; j++) {
			
				if(arr[j] > arr[j+1]) {
				
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		*/

		/*	//Approach :2

		for(int i = 0 ; i < arr.length; i++ ) {
		
			for(int j = 0 ; j < arr.length-i-1; j++) {
				count++;
			
				if(arr[j] > arr[j+1]) {
				
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}

		*/


		boolean swapped;
		
		for(int i = 0 ; i < arr.length; i++) {
		
			swapped = false;
			for(int j = 0 ; j <arr.length-i-1; j++) {
			
				count++;
				if(arr[j] > arr[j+1]) {
				
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					swapped = true;
				}
			}

			if(swapped == false) {
				break;
			}
		}


		System.out.println(Arrays.toString(arr));
		System.out.println(count);
	}
}
