/*

   Given an array of size N & Q number of queries.
   Query contains two parameters start and end (s, e).

   For all queries print sum of all elements from index s to e.

Arr : [-3, 6, 2, 4, 5, 2, 8, -9, 3, 1]
N : 10;
Q : 3

Queris          s       e       sum
q1              1       3       12
q2              2       7       12
q1              1       1       6

*/

import java.util.Scanner;

class PrfixSumDemo {

	public static void main(String[] args) {
	
		int arr[] = new int[] {-3, 6, 2, 4, 5, 2, 8, -9, 3, 1};

		int psarr[] = new int[arr.length];
		int Q = 3;

		psarr[0] = arr[0];

		for(int i = 1 ; i < arr.length ; i++) {
		
			psarr[i] = psarr[i-1] + arr[i];
		}

		Scanner sc = new Scanner(System.in);

		int sum = 0;

		for(int i = 0 ; i < Q ; i++) {
		
			int start = sc.nextInt();
			int end = sc.nextInt();

			if(start == 0)
				sum = psarr[end];
			else
				sum = psarr[end]  - psarr[start-1];

			System.out.println(sum);
		}
	}
}
