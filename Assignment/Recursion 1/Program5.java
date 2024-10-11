//WAP to check whether the number is prime or not.

class Program5 { 

	
	static boolean isPrime(int n, int i) {
	       // Base cases

        	if (n <= 2)
            		return (n == 2) ? true : false;
        	if (n % i == 0)
            		return false;
        	if (i * i > n)
            		return true;
      
        // Check for next divisor
        	return isPrime(n, i + 1);
    }
	public static void main(String[] args) {
	
		int num = 7;
		if(isPrime(num, 3))
			System.out.println("Prime");
		else

			System.out.println("Not Prime");
	}
}
