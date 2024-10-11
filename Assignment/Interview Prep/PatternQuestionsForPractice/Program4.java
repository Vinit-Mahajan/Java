/*

   ROWS = 3
1 1 1
2 2 2
3 3 3

*/
class Program4 {

	public static void main(String[] args) {
	
		int rows = 3;
		for(int i = 1 ; i <= rows ; i++) {
		
			for(int j = 1 ; j <= rows ; j++) {
			
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
