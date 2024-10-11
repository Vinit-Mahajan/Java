class TP {

	public static void main(String[] args) {
	
		int n = 4;

		
		/*
		for(int i = 1 ; i <= n ; i++) {
		
			for(int j = 1; j <= n-i+1; j++) {
			
				System.out.print("* ");
			}
			System.out.println();
		}

		*/


		/*

		for(int i = 1 ; i <= n; i++) {
		
			for(int j = 1 ; j <= i ; j++) {
			
				System.out.print("*");
			}
			System.out.println();
		}

		for(int k = 1 ; k <= n ; k++) {
		
			for(int l = n-1 ; l >= k ; l--) {
			
				System.out.print("*");
			}
			System.out.println();
		}

		*/


		for(int i = 1; i <= n ; i++) {
		
			for(int j = n; j >= i; j--) {
			
				System.out.print(" ");
			}
			for(int k = 1 ; k <= i ; k++) {
			
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
