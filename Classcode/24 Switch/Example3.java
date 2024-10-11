class Example3 {

	public static void main(String[] args) {
	
		int x = 2;

		switch(x) {
		
			case 1: 
				System.out.println("1");
				break;
			case 1+1:
				System.out.println("1+1");
				break;
			case 3:
				System.out.println("3");
				break;
			case 2:
				System.out.println("2");
			default:
				System.out.println("Default");
				break;
		}
	}
}
