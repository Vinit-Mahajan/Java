//WAP to find the factorial of a number.

class Program7 {

	static int findFact(int num) {
	
		if(num <= 1) {
			return 1;
		}
		return num * findFact(num-1);
	}

	public static void main(String[] args) {
	
		int num = 0;
		int fact = findFact(num);
		System.out.println(fact);
	}
}
