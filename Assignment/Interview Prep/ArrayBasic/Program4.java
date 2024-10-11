class ProductOfElements {

	static int findProduct(int arr[]) {
	
		int prod = 1;
		for(int i = 0 ; i < arr.length ;i++) {
		
			prod = prod * arr[i];
		}
		return prod;
	
	}
	public static void main(String[] args) {
	
		int arr[] = {1, 2, 3, 4, 5}; 
		System.out.println(findProduct(arr));
	}	
	

}
