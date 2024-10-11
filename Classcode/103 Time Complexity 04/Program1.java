class SumDemo {
	
	static int findSum(int no) {
	
		/*int sum = 0;
		for(int i = 0 ; i <= no ; i++) {
		
			sum = sum + i;
		}
		return sum;*/

		return (no*(no+1))/2;
	}
	public static void main(String[] args) {
	
		int no = 10;
		System.out.println(findSum(no));
	}
}
