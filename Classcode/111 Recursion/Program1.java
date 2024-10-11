class Program1 {

	//Tail Recursion 
	
	void fun(int no) {
	
		if(no == 0) 
			return;
		System.out.println(no);
		fun(--no);
	}

	public static void main(String[] args) {
	
		System.out.println("Start Main");
		Program1 obj = new Program1();

		obj.fun(2);

		System.out.println("End Main");
	}
} 
