class StrBufferDemo {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer(100);
		sb.append("Vinit");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(System.identityHashCode(sb));

		sb.append("Mahajan");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(System.identityHashCode(sb));

		System.out.println("_______________________________________");

		String str1 = "Shashi";
		String str2 = new String("Bagal");
		StringBuffer str3 = new StringBuffer("Core2Web");
		//String str4 = str1.append(str3);			//This is error: append() is not method of String class.

		StringBuffer str4 = str3.append(str1);


		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);

	}
}
