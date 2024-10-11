/*

   ROWS = 3

A b C
d E f
G h I

A b C
d E f
G h I

*/

class Program16 {

	public static void main(String[] args) {
	
		int rows = 3;
		char ch1 = 'a';
		char ch2 = 'A';

		int no = 1;

		for(int i = 1 ; i <= rows ; i++) {
		
			for(int j = 1 ; j <= rows ; j++) {
			
				if(no %2 == 1) {
				
					System.out.print(ch2 + " ");
					no++;
					ch1++;
					ch2++;
				}
				else {
				
					System.out.print(ch1 + " ");
					no++;
					ch1++;
					ch2++;
				}
			}
			System.out.println();
		}
	}
}
