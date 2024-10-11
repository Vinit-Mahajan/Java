/*

   ROWS = 3

a B c
d E f
g H i

*/

class Program12 {

	public static void main(String[] args) {
	
		char ch1 = 'a';
		char ch2 = 'A';

		int rows = 3;
		
		for(int i = 1 ; i <= rows ; i++) {
		
			for(int j = 1 ; j <= rows ; j++) {
			
				if(j %2 == 1){
					System.out.print(ch1 + " ");
					ch2++;
				}	
				else {
					System.out.print(ch2 + " ");
					ch2++;			
				}
				ch1++;
			}
			System.out.println();
		}
	}
}
