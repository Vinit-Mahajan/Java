class Program4 {

	public static void main(String[] args) {
	
		int rows = 4;
		
		for(int i = 1; i <= rows ; i++) {
		
			for(int j = rows ; j >= i ; j--) {
			
				System.out.print("3C ");
			}
			System.out.println();
		}
	}
}
