//WAP to display the first 10 natural numbers in reverse order.

class Program2 {

	/*
	static void printReverse(int num) {
	
		if(num >= 1) {
		
			System.out.print(num + " ");
			printReverse(--num);
		}
	}
	public static void main(String[] args) {
	
		int num = 10;
		printReverse(10);
	}

	*/ //Solution
	static void reverseNum(int num){

		if(num == 0){
			return;
		}
		System.out.println(num);
		reverseNum(num-1);
	}
	public static void main(String[] args){

		reverseNum(10);
	}

	
}
