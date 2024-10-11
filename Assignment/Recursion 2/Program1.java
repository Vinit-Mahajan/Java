//Q. 1
//Write a program to print the factorial of a given number.

import java.util.Scanner;

class Program1 {

	int findFact(int num) {
	
		if(num == 0)
			return 1;
		return num * findFact(num-1);
	}

	public static void main(String[] args) {
	
		Program1 obj = new Program1();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int fact = obj.findFact(num);
		System.out.println(fact);
	}
}
