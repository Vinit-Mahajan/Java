class Program10 {
	public static void main(String[] args) {
		//int no = 2332;
		int no = 1234;
		int temp = no;
		int rev = 0;
		while (temp != 0) {
			
			int rem = temp % 10;
			rev = (rev * 10) + rem;
			temp = temp / 10;


		}
		if(no == rev) {
			System.out.println(no + " is pallindrome number");
		}
		else {
			System.out.println(no + " is not pallindrome number");
		}
	}
}
