/*

   ROWS = 3

1 2 3
2 3 4
3 4 5

*/

class Program13 {

	public static void main(String[] args) {

		int rows = 3;

		//int count = 3;

		for(int i = 1 ; i <= rows ; i++) {

			for(int j = i ; j < i + rows ; j++) {
			
				System.out.print(j + " ");
			}
			
			System.out.println();
		}
	}
}
