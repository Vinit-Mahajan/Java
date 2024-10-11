class EqualsIgnoreCaseDemo {

	public static void main(String[] args) {
	
		String str1 = "Vinit";
		String str2 = "vInIt";

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		System.out.println(str1.equalsIgnoreCase(str2));

	}
}
