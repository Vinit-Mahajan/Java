/*

   ROWS = 4

D D D D
C C C C
B B B B
A A A A

*/

class Program14 {

	public static void main(String[] args) {
	
		int rows = 4;

		char ch = 'A';
		for(int i = 0 ; i < rows-1 ; i++) {
			
			ch++;
		}
		
		for(int i = 1 ; i <= rows ; i++) {
		
			for(int j = 1 ; j<= rows ; j++) {
			
				System.out.print(ch + " ");
			}
			System.out.println();
			ch--;
		}
	}
}
