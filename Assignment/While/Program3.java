class Program3 {
	public static void main(String[] args) {
		int no = 1111111111;
		int count = 0;

		while(no != 0) {
			int rem = no % 10;
			no = no / 10;
			count ++;
			
		}

		System.out.println("count of digits = " + count);

	}
}
