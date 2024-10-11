class ReplaceDemo{

	public static void main(String[] args) {
	
		String str = "Shashi";

		System.out.println(System.identityHashCode(str));

		System.out.println(str.replace('h','p'));
		
		System.out.println(System.identityHashCode(str));
	}
}
