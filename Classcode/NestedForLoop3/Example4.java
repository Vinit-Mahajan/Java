/*
 
   1 
   1 2 
   1 2 3
   1 2 3 4
*/


class Example4 {

	public static void main(String[] args) {
	
		for(int i = 1 ; i <= 5 ; i++) {
			int num = 1;
			for(int j = 1 ; j <= i ; j++) {
			
				System.out.print(num++ + " ");
			}

			System.out.println();
		}
	}
	
}
