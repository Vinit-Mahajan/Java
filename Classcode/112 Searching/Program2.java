class ReverseStringUsingArray {

	public static void main(String[] args) {
	
		String str = "Vinit";
		char newString[] = str.toCharArray();

		int start = 0;
		int end = newString.length-1;

		while(start < end) {
		
			char temp = newString[start];
			newString[start] = newString[end];
			newString[end] = temp;

			start++;
			end--;
		}

		System.out.println(newString);
	}
}
