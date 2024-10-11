class Example1 {

	public static void main(String[] args) {
	
		int x = 3;

		switch(x){
			case 1: 
				System.out.println("One");
			case 2:
				System.out.println("Two");
			case 3:
				System.out.println("Three"); //After This matches it will print the below lines as well, to avoid that we will use break keyword.
			case 4:
				System.out.println("Four");
			case 5:
				System.out.println("Five");
			default:
				System.out.println("No Match");
			System.out.println("Switch End....");
		}
	}
}
