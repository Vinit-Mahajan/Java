//WAP to print the length of digits in a number.


class Program4 {

	
	static int count = 0;
	
	/*

	static int printLength(int num) {
	
	
		//int count = 0;
		if(num > 0 ){
			count++;
			printLength(num/10);
		}
		return count;

		*/	//Solution

	static int printLength(int num){
		if(num/10 == 0){
			return 1;
		}

		return printLength(num/10) + 1;
	}

	
	public static void main(String[] args) {
	
		int num = 12345;
		int count = printLength(num);
		System.out.println(count);
	}
}
