class Program3 {

	void fun(int num) {
	
		if(num == 0) 
			return;
		num = 5 + fun(--num);
		System.out.println(num);
	}

	public static void main(String[] args) {
	
		System.out.println("Start Main");
		
		Program3 obj = new Program3();
		obj.fun(2);

		System.out.println("End Main");
	}
}
