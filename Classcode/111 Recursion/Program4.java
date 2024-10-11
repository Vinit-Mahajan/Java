class Program4 {

	int fun(int no) {
	
		if(no == 0)
			return 1;
		return 5 + fun(--no);
	}

	public static void main(String[] args) {
	
		Program4 obj = new Program4();
		int res = obj.fun(2);
		System.out.println(res);
	}
}
