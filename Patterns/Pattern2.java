class Pattern2 {

	public static void main(String[] args) {
	
		/*for(int i = 4; i>=1 ; i--) {
		
			for(int j = 4; j >= 1; j--) {
			
				System.out.print(j + " ");
			}
			System.out.println();
		}*/
	
		int i = 4;
		while(i >= 1) {
			int j = 4;
			while(j>=1) {
				System.out.print(j + " ");
				j--;
			}
			System.out.println();
			i--;
		}
	}
}
