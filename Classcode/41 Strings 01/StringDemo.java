class StringDemo {

	public static void main(String[] args) {
	
		String str1 = "Vinit";
		String str2 = "Vinit";
		String str3 = new String("Vinit");


		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

		System.out.println("_________________________________________________________");

		str2 = "Mahajan";

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	}
}
