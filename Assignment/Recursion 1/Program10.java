//WAP to check whether the given number is palindrome or not.

class Program10 {

	int isPallindrome(int num, int temp) {
	
		if(num == 0)
			return temp;
		temp = (temp * 10) + (num%10);
		return isPallindrome(num/10 , temp);

	}
	public static void main(String[] args) {
	
		Program10 obj = new Program10();
		int num = 123321;
		if(obj.isPallindrome(num, 0) == num){
		
			System.out.println("Pallindrome");
		}
		else
			System.out.println("Not Pallindrome");
	}
}
