/*

A 1 A 1
A 1 A 1
A 1 A 1

*/

class Example5 {

	public static void main(String[] args) {
		
		int num = 1;
                char ch = 'A';



		for(int i = 1 ; i <= 3 ; i++) {

		
			for(int j = 1 ; j <= 4 ; j++) {
			
				if(j%2 == 1)
					System.out.print(ch + " ");
				else
				       System.out.print(num + " ");	
			}
			System.out.println();
		}
	}

}
