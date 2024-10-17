class MergeSortLogic {
	public static void main(String[] args) {
	
		int arr1[] = {23,78,90};
		int arr2[] = {1,2,3};

		int arr3[] = new int[arr1.length + arr2.length];

		int i = 0;
		int j = 0;
		int k = 0;

		while(i < arr1.length && j < arr2.length){
			if(arr1[i] <= arr2[j]){
				arr3[k] = arr1[i];
				i++;
			} else {
				arr3[k] = arr2[j];
				j++;
			}
			
			k++;

		}
		while(i < arr1.length) {;
			arr3[k] = arr1[i];
			i++;
			k++;
		}
		while(j < arr2.length){
			arr3[k] = arr2[j];
			j++;
			k++;
		}

		for(int z = 0 ; z < arr3.length ; z++) {
			System.out.print(arr3[z] +" ");
		}

	}
	
}
