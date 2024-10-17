class MergeSort{
	static void merge(int arr[], int start, int mid, int end){
		int n1 = mid-start+1;
		int n2 = end-mid;

		int arr1[] = new int[n1];
		int arr2[] = new int[n2];

		for(int i = 0 ; i < n1; i++){
			arr1[i] = arr[start + i];
		}

		for(int j = 0; j < n2 ; j++) {
			arr2[j] = arr[mid+1+j];
		}

		int i = 0 ; int j = 0 ; int k = start;

		while(i < arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				arr[k] = arr1[i];
				i++;
			} else{
				arr[k] = arr2[j];
				j++;			
			}
			k++;
		}

		while(i < arr1.length){
			arr[k] = arr1[i];
			i++;
			k++;
		}
		while( j < arr2.length) {
			arr[k] = arr2[j];
			j++;
			k++;
		}


	}
	static void mergeSort(int arr[], int start, int end) {
		if(start < end) {
			int mid = (start+end)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
	}
	static void printArray(int arr[]) {
		for(int i = 0 ; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
	
		int arr[] = {5, 4, 3, 2, 1};
		int start = 0 ;
		int end = arr.length-1;

		System.out.println("Before sort : ");
		printArray(arr);
		
		mergeSort(arr, start, end);

		System.out.println("After sort : ");
		printArray(arr);
	}
}
