/*

   ROWS = 3

9 8 7
6 5 4
3 2 1

*/

class Program6 {

	public static void main(String[] args) {
	
		int no = 9;
		int rows = 3;

		for(int i = 1 ; i <= rows ; i++) {
		
			for(int j = 1 ; j <= rows ; j++) {
			
				System.out.print(no + " ");
				no--;
			}
			System.out.println();
		}
	}
}
