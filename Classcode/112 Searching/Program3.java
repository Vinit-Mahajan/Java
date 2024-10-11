class ReverseStringUsingRecursion {

	String reverseString(String str) {
	
		if(str == null || str.length() <= 1 )
			return str;
		return reverseString(str.substring(1)) + str.charAt(0);
	}

	public static void main(String[] args) {
	
		ReverseStringUsingRecursion rs = new ReverseStringUsingRecursion();
		String str = "Vinit";

		String reverse = rs.reverseString(str);
		System.out.println(reverse);
	}
}
