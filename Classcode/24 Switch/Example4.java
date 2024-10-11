class Example4 {
	
	public static void main(String[] args) {
	
		char ch = 65;

		switch(ch) {
		
			case 'A':
				System.out.println("A");
				break;
			case 'B':
				System.out.println("B");
				break;
			default:
				System.out.println("Default");
				break;
			case 65:				//Error: duplicate case label.
				System.out.println("65");
		}
	}


}
