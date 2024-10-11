/*

   Given an integer array of size N. Build an array leftmax of size.
   leftmax of i contains the maximum for the index 0 to index i.

IP :=
	arr : [-3,6,2,4,5,2,8,-9,3,1]

OP:=
	[-3,6,6,6,6,6,8,8,8,8]


*/
class LeftMaxArray {

	public static void main(String[] args) {
	
		int arr[] = new int[] {-3,6,2,4,5,2,8,-9,3,1};
		
		int max = Integer.MIN_VALUE;

		int lftMax[] = new int[arr.length];

		/*
		 for(int i = 0 ; i < arr.length ; i++) {
		
			for(int j = 0 ; j <= i ; j++) {
			
				if(arr[j] > max){
				
					max = arr[j];			//Bruteforce
				}
				lftMax[i] = max;
			}
		}

		for(int i = 0 ; i < lftMax.length ; i++) {
		
			System.out.print(lftMax[i] + " ");
		}

		*/

		//Optimized	{carryforward approach}
		//
		
		lftMax[0] = arr[0];

		for(int i = 1 ; i < arr.length ; i++) {
		
			if(lftMax[i-1] < arr[i]) {
			
				lftMax[i] = arr[i];
			}
			else
				lftMax[i] = lftMax[i-1];
		}

		for(int i = 0 ; i < lftMax.length ; i++) {
		
			System.out.print(lftMax[i] + " ");
		}
	}
}
