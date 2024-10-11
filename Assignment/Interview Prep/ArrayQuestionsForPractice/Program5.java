/*

Write a program to create an array of ‘n’ integer elements.
Where ‘n’ value should be taken from the user.
Insert the values from users and find the max number from the array

Input:
n=5
Enter elements in the array:
2
3
6
9
5
Output:
9

*/

import java.util.*;

class Program5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i = 0 ; i < arr.length ; i++) {
		
			arr[i] = sc.nextInt();
		}

		int max = Integer.MIN_VALUE;

		for(int i = 0 ; i < arr.length ; i++) {
		
			if(max < arr[i]) {
			
				max = arr[i];
			}
		}

		System.out.println(max);
	}

}
