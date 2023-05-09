class Program3 {

	public static void main(String[] args) {

		int sum = 100;
	
		for(int i = 1; i <= 10; i++) {
			
			sum = 100 + sum + i;
			System.out.println(sum);	
		}
		System.out.println("Addition of first three digit numbers : " + sum);
	}
}
