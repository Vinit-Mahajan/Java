import java.util.Arrays;

class EvenOccuringElements {
    
    static void printRepeatingEven(int arr[], int n) {

	    Arrays.sort(arr); 

            int count = 1;
        
       	    for (int i = 1; i < n; i++) {
		    if (arr[i] == arr[i - 1]) {
			    count++;
			    
		    } else {
			    
			    if (count % 2 == 0) {
				    System.out.print(arr[i - 1] + " ");
			    }
			    count = 1;
		    }
	    }
	    if (count % 2 == 0) {
            
		    System.out.print(arr[n - 1] + " ");
	    }
    }

    public static void main(String args[]) {
	    int arr[] = {9, 12, 23, 10, 12, 12, 15, 23, 14, 12, 15};
	    int n = arr.length;
	    printRepeatingEven(arr, n);
    }
}

