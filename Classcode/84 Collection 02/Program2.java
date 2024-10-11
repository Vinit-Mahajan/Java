import java.util.*;

class Program2 extends ArrayList{

	public static void main(String[] args) {
	
		Program2 al = new Program2();
		
		//add(Element)
		al.add(10);
		al.add("Vinit");
		al.add(10.66f);
		al.add(10);
		al.add("Vinit");
			
		System.out.println(al);
		
		//add(int,Element)
		al.add(3,"Mahajan");	
		System.out.println(al);

		//size()
		System.out.println(al.size());

		//contains(Object) 
		System.out.println(al.contains("Vinit"));	//true
		System.out.println(al.contains(60));		//false
		
		//indexOf(Object)
		System.out.println(al.indexOf("Vinit"));	//1

		//lastIndexOf(Object)
		System.out.println(al.lastIndexOf("Vinit"));	//5 - In Middle at 3rd position "Mahajan" is added
		
		//get(int)
		System.out.println(al.get(2));			//10.66

		//set(index,Incubator)
		System.out.println(al.set(3,"Incubator"));

		System.out.println(al);

		
		ArrayList al2 = new ArrayList();
		al2.add("Salman");
		al2.add("Shahrukh");
		al2.add("Amir");

		//addAll(collection)
		
		al.addAll(al2);
		System.out.println(al);
		
		//addAll(int, collection)
		al.addAll(3, al2);
		System.out.println(al);

		//removeRange(int, int)

		al.removeRange(3, 5);
		System.out.println(al);
		
		System.out.println("_____________Before remove()__________");
		System.out.println(al);
		//remove(int)
		System.out.println(al.remove(5));	

		//toArray
		Object arr[] = al.toArray();
		
		for(Object data : arr) {
		
			System.out.print(data + " ");
		}
		System.out.println();


		//clear()
		//
		al.clear();
		System.out.println(al);
	}

}
