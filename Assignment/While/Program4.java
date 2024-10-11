class Program4 {
	public static void main(String[] args) {
		int no = 123;
		int oddDigits = 0;

		while(no != 0) {
			int rem = no % 10;
			if(rem %2 == 1) {
				oddDigits++;
			}
			no = no / 10;
		}
		System.out.println("count of odd digits = " + oddDigits);
	}
}
