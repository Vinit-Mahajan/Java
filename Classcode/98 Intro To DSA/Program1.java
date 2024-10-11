class Factors{
		
	static int findFactors(int no) {
	
/*		int count = 0;
		for(int i = 1 ; i <= no; i++) {
		
			if(no % i == 0) {
			
				count++;
			}
		}

		return count;
*/
	
		int count = 0;

		for(int i = 1 ; i < no/2 ; i++) {
		
			if(no % i == 0) {
			
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
	
		int no = 15;
		System.out.println(findFactors(no));
	}
}
