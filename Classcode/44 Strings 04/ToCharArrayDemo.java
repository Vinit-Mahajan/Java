class ToCharArrayDemo{


	static int findLength(String str) {
	
		char arr[] = str.toCharArray();
		int count=0;

		for(int i = 0; i <arr.length; i++) {
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
	
		String str1 = "Vinit";
		char arr[] = str1.toCharArray();
		
		//System.out.println(str[1]);		//We cannot access the element of the string.
		
		System.out.println(arr[1]);
		int len = findLength(str1);
		System.out.println("Length is : " + len);


	}
}
