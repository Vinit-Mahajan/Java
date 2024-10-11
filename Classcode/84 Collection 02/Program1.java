import java.util.*;

class Program1 {

	public static void main(String[] args) {
	
		// List obj = new List();		//error: List is Interface so we cant create object.
		List obj = new ArrayList();		//Here ArrayList is class.
		obj.add(10);
		obj.add(20);
		obj.add(10);

		System.out.println(obj);
	}

}
