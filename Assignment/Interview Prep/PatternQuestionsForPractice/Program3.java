/*

   ROWS = 3
a b c
d e f
g h i

*/
class Program3 {

	public static void main(String[] args) {
	
		char ch = 'a';
		int rows = 3;
		for(int i = 1 ; i <= rows ; i++) {
		
			for(int j = 1 ; j <= rows ; j++) {
			
				System.out.print(ch + " ");
			       	ch++;
			}
			System.out.println();
		}
	}
}
