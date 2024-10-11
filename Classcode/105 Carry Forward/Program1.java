class MaxInRange {

	public static void main(String[] args) {
	
		int arr[] = new int[] {3,4,5,1,2,7,8,9};
		int N= 8;
		int i = 3;
		
		int max = Integer.MIN_VALUE;

		for(int j = 1 ; j <= i ; j++) {
		
			if(arr[j] > max)
				max = arr[j];
		}
		System.out.println(max);
	}
}
