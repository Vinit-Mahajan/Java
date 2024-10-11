class StrBufferDemo {

	public static void main(String[] args) {
	
		StringBuffer sb = new StringBuffer();
		
		sb.append("Shashi");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.hashCode());



		sb.append("Bagal");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.hashCode());


		sb.append("Core2Web");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(System.identityHashCode(sb));
		System.out.println(sb.hashCode());


	}
}
