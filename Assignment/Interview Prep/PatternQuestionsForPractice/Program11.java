/*

   ROWS = 4

d d d d
c c c c
b b b b
a a a a

*/

class Program11 {

	public static void main(String[] args) {
	
		char ch = 'a';
		
		int rows = 4;

		for(int i = 0 ; i < rows-1 ; i++) {
			
			ch++;
		}

		for(int i = rows ; i >= 1 ; i--) {
			
			for(int j = 1 ; j <= rows ; j++) {
			
				System.out.print(ch + " ");
			}
			System.out.println();
			ch--;
		}
	}
}
