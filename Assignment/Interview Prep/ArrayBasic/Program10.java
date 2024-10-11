class MaxOddSum {

	static void findMaxSum(int arr[]) {
	
		int sum = 0;


		for(int i = 0 ; i< arr.length ; i++) {

			if(arr[i] > 0) {
			
				sum = sum + arr[i];
			}
		}

		if(sum %2 != 0)
			System.out.println(sum);
		else
			System.out.println("-1");
	}

	public static void main(String[] args) {
	
		int arr[] = {2, 5, -4, 3, -1};
		findMaxSum(arr);
	}
}
