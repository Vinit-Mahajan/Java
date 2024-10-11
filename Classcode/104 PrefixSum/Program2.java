/*

   Given an array of size N & Q number of queries.
   Query contains two parameters start and end (s, e).

   For all queries print sum of all elements from index s to e.

Arr : [-3, 6, 2, 4, 5, 2, 8, -9, 3, 1]
N : 10;
Q : 3

Queris		s 	e 	sum
q1		1 	3 	12
q2		2 	7	12
q1		1 	1	6

*/

import java.util.Scanner;

class FindSumInQueries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int arr[] = new int[] {-3,6,2,4,5,2,8,-9,3,1};

		int Q = sc.nextInt();
		
		for(int i = 0; i < Q ; i++) {
		
			int sum = 0;

			int start = sc.nextInt();
			int end = sc.nextInt();
		
		
			for(int j = start ; j <= end ; j++) {
			
				sum = sum + arr[j];
			}

			System.out.println(sum);
		}
	}
}
