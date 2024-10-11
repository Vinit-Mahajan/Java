import java.util.Scanner;
class BinarySearch {

	/*

	int search(int arr[] , int search) {
	
		int start = 0;
		int end = arr.length-1;

		while(start <= end) {
		
			int mid = (start + end)/2;

			if(arr[mid] == search)
			       return mid;
			if(arr[mid] < search)
				start = mid+1;
			if(arr[mid] > search)
				end = mid-1;
		}
		return -1;
	}

	*/

	int search(int arr[], int start, int end, int search) {
	
		if(start > end)
			return -1;
		else {
		
			int mid = (start+end)/2;
			if(arr[mid] == search)
				return mid;
			if(arr[mid] < search)
				return search(arr, mid+1, end, search);
			else
				return search(arr, start, mid-1, search);
		}

	}
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		BinarySearch bs = new BinarySearch();

		int arr[] = new int[] {1,4,2,6,7};

		int search = sc.nextInt();

		int ans = bs.search(arr, 0, arr.length-1, search);

		if(ans == -1)
			System.out.println("No such element found");
		else
			System.out.println("Element at index " + ans);
		
	}
}
