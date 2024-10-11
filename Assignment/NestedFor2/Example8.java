/*
 
   A b C d
   E f G h
   I j K l
   M n O p

   */



class Example8 {

	public static void main(String[] args) {
	
		//a == char ch = 97;
		//System.out.println(ch);
		//
	
		char ch = 'A';
		char ch2= 'a';

		for(int i = 1 ; i <= 4 ; i++) {
		

			for(int j = 1 ; j <= 4 ; j++) {
			
				if(j%2 == 0) {
					System.out.print(ch2 + " ");
					
				}
				else{
					System.out.print(ch + " ");
				}
				ch++;
				ch2++;
				
			}
			System.out.println();
		}
	}
}
