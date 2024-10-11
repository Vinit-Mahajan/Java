//WAP to count the occurrence of a specific digit in a given number.

class Program8 {

	/*
	static int count = 0;
	static int findCount(int num , int no) {
	
		//int count = 0;
		int rem = num%10;
		

		if(rem == no) {
		
			count++;
		}
		if(num == 0) {
		
			return count;
		}
		return findCount((num/10), 1);

	*/

	}
	public static void main(String[] args) {
	
		int num = 123451;
		int no = 1;
		int ans = findCount(num , no);
		System.out.println(ans);
	}
}
