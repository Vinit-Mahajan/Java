class Program5 {
	public static void main(String[] args) {
		int no = 942111423;
		int sq;

		while(no != 0) {
			int rem = no % 10;
			if(rem%2 == 0) {
				System.out.print(rem*rem + " ");	
			}
			no = no / 10;
		}
	}
}
