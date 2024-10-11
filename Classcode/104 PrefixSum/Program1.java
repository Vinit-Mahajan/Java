class FindSumBetweenStartAndEnd {

	public static void main(String[] args) {

		int arr[] = new int[]{2,5,3,11,7,9};
		int start = 0;
		int end = arr.length-1;
		int Q = 3;

		int sum =0;

		for(int i = start ; i <= end ; i++) {
		
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}
