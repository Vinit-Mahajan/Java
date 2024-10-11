class ProductOfMaxAndMinInArray {

	static int findProduct(int arr1[], int arr2[]) {
	
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;

		for(int i = 0 ; i < arr1.length ; i++) {
		
			if(max < arr1[i]) {
			
				max = arr1[i];
			}
		}

		for(int i = 0 ; i < arr2.length ; i++) {
		
			if(min > arr2[i]) {
			
				min = arr2[i];
			}
		}
		
		return min*max;
	}
	
	public static void main(String[] args) {
	
		int a1[] = {0, 0, 0, 0};
		int a2[] = {1, -1, 2};

		System.out.println(findProduct(a1 , a2));

	}
}
