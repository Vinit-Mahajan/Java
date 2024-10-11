class SearchElement {


	static int searchElement(int arr[] , int no) {
	
		int ans = 0 ;
		for(int i = 0 ; i < arr.length; i++) {
		
			if(arr[i] == no){	
				
				ans = i;
			}
		}
		return ans;

	}
	public static void main(String[] main) {
	
		int arr[] = {1,2,3,4};
		int no = 4;

		System.out.println(searchElement(arr,no));
	
	}
}
