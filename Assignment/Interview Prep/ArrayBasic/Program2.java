class MaxAndMinElementInArray {

	static void findMaxMin(int arr[]) {
	
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for(int i = 0 ; i < arr.length ; i++) {
		
			if(arr[i] < min) {
			
				min = arr[i];
			}

			if(arr[i] > max) {
			
				max = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}
	public static void main(String[] args) {
	
		int arr[] = {3,2,1,56,10000,167};
		findMaxMin(arr);
	}
}
