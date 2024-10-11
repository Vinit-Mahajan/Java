class ClsObj {

		
	int y = 20;

	//System.out.println(y);

	static void fun() {
	
		int z = 30;
		System.out.println(z);
	}


	public static void main(String[] args) {
	
		ClsObj obj = new ClsObj();
		int x = 10;
		System.out.println(x);
		fun();
		System.out.println(obj.y);
		
	}
}
