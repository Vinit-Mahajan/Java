class InsrtionSort {
	
	static void insertSort(int arr[]) {
		for(int i = 1 ; i < arr.length ; i++) {
			int element = arr[i];
			int j = i-1;
			while(j >= 0 && arr[j]>element) {
				arr[j+1] = arr[j];
				j--;
			}	
			arr[j+1] = element;	
		}		

	}

	static void printarr(int arr[]) {
	
		for(int i = 0 ; i < arr.length ; i++){;
			System.out.print(arr[i]);		
		}
		System.out.println();
	}

	public static void main(String[] args) {
		
		int arr[] = {5, 2, 1, 3, 4};
		System.out.println("Before Swapping : ");
		printarr(arr);
		insertSort(arr);
		System.out.println("After Swapping : ");
		printarr(arr);
	}
}
