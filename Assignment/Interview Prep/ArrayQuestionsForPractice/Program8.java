/*

   Program 8:
Write a program to create an array of ‘n’ integer elements.
Where ‘n’ value should be taken from the user.
Insert the values from the user and find the frequency of digit

Input:
n=6
Enter elements in the array:
2
3
6
3
5
2

Output:
frequency of 2 is 2
frequency of 3 is 2
frequency of 6 is 1
frequency of 5 is 1
   
*/

import java.util.*;
class Program8 {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                int size = sc.nextInt();

                int arr[] = new int[size];

                for(int i = 0 ; i < arr.length ; i++) {

                        arr[i] = sc.nextInt();
                }

		for(int i = 0 ; i < arr.length ; i++) {
		
			int count = 0;

			for(int j = 0 ; j < arr.length ; j++ ) {
				
				if(arr[i] == arr[j]) {
				
					count++;
				}
			}

			System.out.println("frequency of " + arr[i] + " is" + count);
		}
	}
}
