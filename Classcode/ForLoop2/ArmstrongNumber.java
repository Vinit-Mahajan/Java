class ArmstrongNumber {
	public static void main (String[] args) {
		int no = 153;
		int temp = no;
		int sum = 0;
		
		for(; no!=0 ; no = no/10) {
			
			int rem = no % 10;
			sum = sum + (rem*rem*rem);
		
		}	

		if(temp == sum) {
			System.out.println("Armstrong Number...");
		}
	}
}
