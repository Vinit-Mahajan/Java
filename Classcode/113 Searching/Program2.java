class Program2 {

	int fun(int num) {
	
		if(num <= 0)
			return 2;
		int ans1 = fun(num-1) + fun(num-2);
		int ans2 = fun(num-2) + fun(num-1);
		return ans1+ans2;
	}
	public static void main(String[] args) {
	
		Program2 obj = new Program2();
		int ret = obj.fun(3);
		System.out.println(ret);
	}
}
