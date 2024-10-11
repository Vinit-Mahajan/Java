class Example5 {

	public static void main(String[] args) {
	
		int x = 3;
		int a = 1;
		int b = 2;

		switch(x) {
		
			case a :
				System.out.println("a");
				break;
			case b:
				System.out.println("b");
				break;
			case a+b:
				System.out.println("a+b");
				break;
			case 3:
				System.out.println("3");
			default:					//Error: constant expression required.
				System.out.println("Default");
		
		}
	}
}
