class Program6 {
	public static void main(String[] args) {
		int sum = 0;
		int mul = 1;
		int i = 1;
		while(i <= 10) {
			if(i%2 == 0) {
				sum = sum + i;
			}
			if(i%2 == 1) {
				mul = mul * i;
			}
			i++;
		}
		System.out.println("sum of even numbers between 1 to 10 = " + sum);
		System.out.println("multiplication of odd numbers between 1 to 10 = " + mul);

	}
}
