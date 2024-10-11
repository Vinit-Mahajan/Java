class FirstAndLastOccurenceOfClass {

	public static void main(String[] args) {
	
		int arr[] = new int[]{1,2,3,4};

		int no = 5;

		int first = Integer.MIN_VALUE;
		int last = Integer.MAX_VALUE;

		for(int i = 0 ; i < arr.length ; i++) {
		
			if(arr[i] == no) {
			
				first = i;
				break;
			}
		}

		for(int i = (arr.length-1) ; i >= 0 ; i--) {
		
			if(arr[i] == no) {
			
				last = i;
				break;
			}
		}
		if(first >=0  && last >= 0)
			System.out.println(first + " " + last);
		else
			System.out.println("-1");
		
	}
}
