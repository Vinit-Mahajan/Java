class Program2 {

	void fun(int no) {
	
		if(no == 0)
			return;
		fun(--no);
		System.out.println(no);
	}
	public static void main(String[] args) {
	
		System.out.println("Start Main");

		Program2 obj = new Program2();
		obj.fun(2);

		System.out.println("End Main");
	}
}
