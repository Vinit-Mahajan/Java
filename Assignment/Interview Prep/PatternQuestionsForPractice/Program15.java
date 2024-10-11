/*

   ROWS = 3

9 64 7
36 5 16
3 4 1

*/

class Program15 {

	public static void main(String[] args) {
	
		int no = 9;
		int rows = 3;

		for(int i = 1 ; i <= rows ; i++) {
			
			for(int j = 1 ; j <= rows ; j++) {
			
				if(no %2 == 0) {
				
					System.out.print((no * no) + " ");
					no--;
				}
				else {
					System.out.print(no + " ");
					no--;
				}
			}
			System.out.println();
		}

	}
}
