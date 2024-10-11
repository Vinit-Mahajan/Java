/*

   ROWS = 3

1 3 5
5 7 9
9 11 13

*/

class Program17 {

	public static void main(String[] args) {
	
		int rows = 3;
		int count = 1;

		for(int i = 1 ; i <= rows ; i++) {
	
			for(int j = 1 ; j <= rows ; j++) {
			
				System.out.print(count + " ");
				count = count + 2;
			}
			System.out.println();
			count = count - 2;
		}
	}
}
