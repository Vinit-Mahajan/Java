class TP {

	public static void main(String[] args) {
	
		/*int rows = 4;

		int d = 2;
		int z = 1;
		
		for(int i = 1 ; i<= rows ; i++) {

			int count = z;

			for(int j = 1; j <= rows ; j++) {

				System.out.print(count + " ");
				count = count + d;
			}
			System.out.println();

			z = z + d;
			d++;
		}
		*/

		int current = 1;
		for(int i = 1 ; i <= 4 ; i++){
		
			int value = current;
			for(int j = 1 ; j <= 4 ; j++) {
			
				System.out.print(value+ " ");
				value += 2;
			}
			current += 2;
			System.out.println();
		}	

	}

}
