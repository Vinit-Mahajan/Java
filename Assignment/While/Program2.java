class Program2 {
	public static void main(String[] args) {
		int no = 6;
		int temp = no;
		int fact = 1;
		while (no > 0) {
			fact = fact * no;
			no--;
		
		}
		System.out.println("factorial of " + temp +" is " + fact);
	}
}
