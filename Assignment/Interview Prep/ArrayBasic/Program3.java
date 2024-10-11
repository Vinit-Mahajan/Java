class LargestElement {

	static int largestElement(int arr[]) {
	
		int large = 0;
		for(int i = 0 ; i < arr.length ; i++) {
		
			if(arr[i] > large) {
			
				large = arr[i];
			}
		}
		return large;
	}
	public static void main(String []args) {
	
		int arr[] = {1, 8, 7, 56, 90};
		System.out.println(largestElement(arr));

	} 

}
