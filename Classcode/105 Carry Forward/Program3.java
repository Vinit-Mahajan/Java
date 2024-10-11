class RightMaxArray {

	public static void main(String[] args) {
	
		int arr[] = new int[] {-3,6,2,4,5,2,8,-9,3,1};
		int rightMax[] = new int[arr.length];
	
		rightMax[rightMax.length-1] = arr[arr.length-1];

		for(int i = arr.length-2 ; i >= 0 ; i--) {
		
			if(arr[i] > rightMax[i+1])
				rightMax[i] = arr[i];
			else
				rightMax[i] = rightMax[i+1];
		}

		for(int i = 0 ; i < rightMax.length; i++) {
		
			System.out.print(rightMax[i] + " ");
		}
	}
}
