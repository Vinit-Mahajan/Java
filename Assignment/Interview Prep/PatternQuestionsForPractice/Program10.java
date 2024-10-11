/*

  1  4  7
  10 13 16
  19 22 25

*/
class Program10 {

	public static void main(String[] args) {
	
		int no = 1;
		int rows = 3;

		for(int i = 1 ; i <= rows ; i++) {
		
			for(int j = 1 ; j <= rows ; j++) {
			
				System.out.print(no + " ");
				no = no + 3;
			
			}
			System.out.println();
		}
	}
}
