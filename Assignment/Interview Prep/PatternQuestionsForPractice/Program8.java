/*

   ROWS = 3
1 3 5
7 9 11
13 15 17

*/

class Program8 {

	public static void main(String[] args) {
	
		int no = 1;
		int rows = 3;

		for(int i = 1 ; i <= rows ; i++) {
		
			for(int j = 1 ; j <= rows ; j++) {
			
				System.out.print(no + " ");
				no = no + 2; 
			}
			System.out.println();			
		}
	}
}
