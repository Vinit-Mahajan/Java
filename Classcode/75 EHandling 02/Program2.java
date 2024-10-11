class Demo {

	public static void main(String[] args) {
		
		try{	
			System.out.println(10/0);
		}catch(ArithmeticException ae) {
			System.out.println("Cant diveide by zero");
		}
	}
}
