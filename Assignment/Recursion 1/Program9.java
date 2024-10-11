//WAP to print string in reverse order.

class Program9 {

	void reverse(String str, int index) {
	
		if(index < str.length()) {
		
			reverse(str, index+1);
			System.out.print(str.charAt(index));
		}
	}

	public static void main(String[] args) {
	
		Program9 obj = new Program9();
		String str = "Vinit";
		obj.reverse(str, 0);
		System.out.println();
	}
}
