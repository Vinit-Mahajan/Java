/*
Write a program to create an array of 5 integer elements.
Insert from the user and print 5 elements from an array
Input:
1
2
3
4
5
Output :
1
2
3
4
5
*/

import java.util.*;

class Program2 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int arr[] = new int[size];

		for(int i = 0 ; i < arr.length ; i++) {
		
			arr[i] = sc.nextInt();
		}

		for(int i = 0 ; i < arr.length ; i++) {

                        System.out.println(arr[i]);
                }


	}
}
