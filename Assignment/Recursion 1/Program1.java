//WAP to print the numbers between 1 to 10.

class Program1 {

	
	static void printNumbers(int num) {
	
		if(num <= 10) {
		
			System.out.print(num + " ");
			printNumbers(num + 1);
		}

	}
	public static void main(String[] args) {
	
		int no = 1;
		printNumbers(1);
	}

	/*   Solution
		
	static void numPrint(int num){

		if(num == 0){
			return;
		}
		numPrint(num-1);
		System.out.println(num);

	}
	public static void main(String[] args){
	
		numPrint(10);

	}

	*/
}
