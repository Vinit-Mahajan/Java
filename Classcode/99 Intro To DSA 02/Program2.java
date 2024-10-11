class FindDifference {

	static int findDifference(int no1 , int no2) {
	
		/*
		
		int count = 0;

		for(int i = no1 ; i <= no2 ; i++) {
		
			count++;
		}
		return count;
		
		*/

		return (no2-no1)+1;

	}

	public static void main(String[] args) {
	
		int no1 = 8;
		int no2 = 13;

		System.out.println(findDifference(no1, no2));
	}
}
