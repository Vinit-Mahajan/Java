/*

   ROWS = 6 Col = 4

1 2 3 4
a b c d
# # # #

5 6 7 8
e f g h
# # # #

*/


class Program18 {


	public static void main(String[] args) {
	
		int rows = 6;
		int cols = 4;

		int count = 1;
		char ch = 'a';

		for(int i = 1 ; i < rows/2 ; i++) {
		
			for(int j = 1 ; j <= cols ; j++) {
			
				System.out.print(count + " ");
				count++;
			}
			System.out.println();

			for(int j = 1; j <= cols ; j++) {
			
				System.out.print(ch+ " ");
				ch++;
			}
			System.out.println();
			for(int j = 1 ; j <= cols ; j++) {
			
				System.out.print("# ");
			}
			System.out.println();
		}
		System.out.println();
	}
}
