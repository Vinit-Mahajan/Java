//WAP to print the sum of n natural numbers.

class Program3 {

	static int printSum(int num) {
	
		if(num <= 1)
			return num;
		return num + printSum(--num);
	}

	public static void main(String[] args) {
	
		int num = 10;
		int sum = printSum(num);
		System.out.println(sum);
	}
}
