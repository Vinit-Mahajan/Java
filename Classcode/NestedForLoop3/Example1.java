/*

*    *
*    *
*    *
*    *

*/


class Example1 {

	public static void main(String[] args) {

		int n = 4;
	
		for(int i = 1 ; i <= 4 ; i++) {
		
			for(int j = 1 ; j <= 4 ; j++) {
			
				if(j == 1 || j == n) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
			}
			
			System.out.println();
		}

	}
}
