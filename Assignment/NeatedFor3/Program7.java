class Program7 {

	public static void main(String[] args) {
	
		int rows = 6;
		char ch = 'F';

		for(int i = 1; i <= rows ; i++) {

			char ch1 = ch;
		
			for(int j = 1 ; j <= i ; j++) {
			
				System.out.print(ch1 + " ");
				ch1++;
			}
			ch--;
			System.out.println();
		}
	}
}
