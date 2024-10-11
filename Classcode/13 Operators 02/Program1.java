class Program1 {

	public static void main(String[] args) {
	
		int x = 10;
		int y = 20;

		int ans = ++x+y+++x++;

		System.out.println(ans);
		System.out.println(x);
		System.out.println(y);
	}
}
