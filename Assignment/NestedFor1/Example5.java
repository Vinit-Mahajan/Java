/*
 
   12 12 12
   11 11 11
   10 10 10

 */

class Example5 {

	public static void main(String[] args) {
	
		int num = 12;

		for(int i = 1 ; i <= 3 ; i++) {
			for(int j = 1 ; j<= 3 ; j++) {
			
				System.out.print(num-i+1 + " ");
			} 
			System.out.println();
		}
	}
}
