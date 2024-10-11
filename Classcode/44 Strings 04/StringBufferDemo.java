class StringBufferDemo {

	public static void main(String[] args) {
	
		StringBuffer str1 = new StringBuffer("Vinit");
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));

		str1.append("Mahajan");
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));


		/*      //This are the string Methods

		String str2 = "Vinit";
		System.out.println(str2);
		System.out.println(System.identityHashCode(str2));

		String str3 = str2.concat("Mahajan");
		System.out.println(str3);
		System.out.println(System.identityHashCode(str3));

		*/
	}

}
