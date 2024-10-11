import java.util.Scanner;

class Program1 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		System.out.println(age);

		System.out.println("Enter the name: ");
		String name = sc.nextLine();
		System.out.println("Name : " + name);
	}
	
}
