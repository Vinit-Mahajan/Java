/*

   ROWS = 3
A A A
B B B
C C C

*/

class Program7 {

	public static void main(String[] args) {
	
		int rows = 3;
		
		char ch = 'A';
		
		for(int i = 1 ; i <= rows ; i++) {
	
		
			for(int j = 1 ; j <= rows ; j++) {
			
				System.out.print(ch + " ");
				
			}
			ch++;
			System.out.println();
		}
	}
}
