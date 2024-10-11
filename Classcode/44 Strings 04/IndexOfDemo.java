class IndexOfDemo{

	public static void main(String[] args) {
	
	
		String str1 = "Shashi";
		System.out.println(System.identityHashCode(str1));
		
		str1 = new String("Shashi");
		System.out.println(System.identityHashCode(str1));
		
		System.out.println(str1.indexOf('h',0));
		System.out.println(str1.indexOf('h',2));
		
	}
}
