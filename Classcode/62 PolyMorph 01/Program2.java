class Parent extends Child{

	Parent() {
	
		System.out.println("In Parent Constructor");
	}
	void fun() {
	
		System.out.println("In fun");
	}

}

class Child extends Parent {

	Child() {
	
		System.out.println("In Child Constructor");
	}
	void gun() {
	
		System.out.println("In gun");
	}

}

class Client {

	public static void main(String[] args) {
	
		Child obj = new Child();	
		obj.fun();
		obj.gun();

		Parent obj2 = new Parent();
		obj2.fun();
		//obj2.gun();			//error for this line because this method is not present in Parent class 
						
	}

}
