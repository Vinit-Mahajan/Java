/*
 
   ROWS = 4
4 4 4 4
3 3 3 3
2 2 2 2
1 1 1 1

 */

class Program5 {

	public static void main(String[] args) {
	
		int rows = 4;

		for(int i = rows ; i >= 1 ; i--) {
		
			for(int j = 1 ; j <= rows ; j++) {
			
				System.out.print(i + " ");
			}		
			System.out.println();
		}
	}
}
