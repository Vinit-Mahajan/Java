/*  
In Place PrfixSum
   Given an array A of N integers
   Construct prefix sum of the array in the given array itself.
   Return an array of integers denoting the prfix sum of the given array.

        Constraints :

        1 <= N <= 10^5
        1 <= A[i] <= 10^3

        I/P 1:
        A = [1,2,3,4,5]

        I/P 2 :
        A = [4,3,2]

        OP 1 :
        [1,3,6,10,15]

        OP 2 :
        [4, 7, 9]

*/


class InPlacePrefixSum {

        void findInPlaceSum(int arr[]) {

              
		for(int i = 1; i < arr.length ; i++) {

                        arr[i] = arr[i-1] + arr[i];
                }

                for(int i = 0 ; i < arr.length ; i++) {

                        System.out.print(arr[i] + " ");
                }
        }

        public static void main(String[] args) {

                InPlacePrefixSum obj = new InPlacePrefixSum();

                int arr[] = new int[]{4,7,9};

                obj.findInPlaceSum(arr);
        }
}

