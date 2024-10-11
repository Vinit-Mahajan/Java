//WAP to calculate the sum of digits of a given positive integer.

class Program6 {

	static int sumOfDigits(int num) {
	
		if(num <= 0)
			return 0;
		return (num%10 + sumOfDigits(num/10) );
	}

	public static void main(String[] args) {
	
		int num = 1234;

		int sum = sumOfDigits(num);
		System.out.println(sum);
	}
}
