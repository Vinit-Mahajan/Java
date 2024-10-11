class RemoveAtIndex {

	static void removeAtIndex (int arr[] , int index) {
	
		int narr[] = new int[arr.length-1];
		
		for(int i = 0, j=0 ; i < arr.length ; i++) {
	
			if(index == i) {
			
				continue;
			}
			
			narr[j++] = arr[i];
		}

		for(int data : narr) {

			System.out.print(data + " ");
		}
		
		
	}
	public static void main(String[] args) {
	
		int arr[] = { 1, 2, 3, 4, 5 };
		int index = 2;

		removeAtIndex(arr, index);
		
	}

}
