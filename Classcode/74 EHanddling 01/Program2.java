class Demo {


	void m1() {
	
		System.out.println("In m1");
	}

	public static void main(String[] args) {
	
		System.out.println("Main Start");
		Demo obj = new Demo();
		
		obj = null;
		obj.m1();

	}
}
