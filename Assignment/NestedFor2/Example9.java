/* 
  1C3  4B2  9A1
  16C3 35B2 36A1
  49C3 64B2 81A1

  */

class Example9 {

	public static void main(String[] args) {
	
	
		int sq = 1;
		for(int i = 1 ; i <= 3 ; i++) {
			
			char ch = 'C';
			int num = 3;

			for(int j = 1 ; j <= 3 ; j++) {
			
				System.out.print((sq*sq)+""+ch+""+num + " ");
				ch--;
				num--;
				sq++;
			}
			System.out.println();
		}
	}
}

