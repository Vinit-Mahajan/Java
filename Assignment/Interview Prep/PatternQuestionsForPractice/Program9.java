/*

   ROWS = 4
1 2 3 4
a b c d
5 6 7 8
e f g h

*/

class Program9 {

	public static void main(String[] args) {
	
		int no = 1; 
		char ch = 'a';
		int rows = 4;

		for(int i = 1 ; i <= rows ; i++) {
		
			for(int j = 1 ; j <= rows ; j++) {
			
				if(i%2 == 1) { 
					System.out.print(no + " ");
					no++;
				}
				else {
				
					System.out.print(ch + " ");
					ch++;
				}
			}
			System.out.println();
		}
	}
}
