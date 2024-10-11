class Replace {

	static int replaceWith5(int no) {

		int multiplier = 1;
		int res = 0;

		while (no > 0) {

            		int digit = no % 10;
            		if (digit == 0) {
                		res = res + 5 * multiplier;
            		} else {
                		res = res + digit * multiplier;
            		}
			
            		no = no / 10;
            		multiplier = multiplier * 10;

		}	

		return res;
	}

	public static void main(String[] args) {
	
		int no = 1004;
		System.out.println(replaceWith5(no));
	}
}
