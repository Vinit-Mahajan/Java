class ElementsInRange {

	static void findInRange(int arr[], int start, int end) {
	
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++) {
		
			if(arr[i] >= start && arr[i] <= end) {
			
				count++;
			}
		}
		if(count == (end-start)+1) {
			
			System.out.println("Yes");		
		}
		else
			System.out.println("No");
	}
	public static void main(String[] args) {
	
		int arr[] = {1, 4, 5, 2, 7, 8, 3};
		int start = 2;
		int end = 6;

		findInRange(arr, start, end);
	}
}
