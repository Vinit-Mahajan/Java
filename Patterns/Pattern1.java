class Pattern1 {

	public static void main(String[] args) {
	
		/*for(int i = 1; i<= 4; i++) {
		
			for(int j = 1; j <=4; j++) {
			
				System.out.print(j + " ") ;
			}
			System.out.println();
		}*/
		
		int i = 1;
		while(i<=4) {
			int j = 1;
			while (j <= 4) {
			
				System.out.print(j + " ");
				j++;
			}
			i++;
			System.out.println();
		}
	}
}
