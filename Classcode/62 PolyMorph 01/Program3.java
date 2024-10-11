class Parent {
	Parent() {
		System.out.println("parent constructor");
	}

	void fun() {
		System.out.println("Parent fun");
	}

}

class Child extends Parent {
	Child() {
		System.out.println("child coms");
	
	}
	void fun() {
	
		System.out.println("child fun");
	}
}

class Clent {

	public static void main(String[] args) {
	
		Parent obj = new Child();

		obj.fun();
	
	}
}
