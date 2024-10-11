class ArmstrongUpdate {
	public static void main(String[] args) {
		int no = 1634;
		int temp1 = no;
		int temp2 = no;
		int count = 0;
		int sum = 0;

		 while(temp1 != 0) {
		 	count++;
			temp1 = temp1 / 10;
		 }

		 while(no != 0) {
		 	int rem = no % 10;
			int mult = 1;

			for(int i = 1; i<=count; i++) {
				mult = mult * rem;
			}
			sum = sum + mult;
			no = no / 10;
		 }
		 if(sum == temp2) {
		 	System.out.println("Armstrong Number");
		 }
		 else {
		 	System.out.println("Not Armstrong");
		 }
	}
}
