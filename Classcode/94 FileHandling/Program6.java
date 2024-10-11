import java.io.*;

class Program6 {

	public static void main(String[] args) throws IOException {
	
		File f1 = new File("Demo1.txt");
		f1.createNewFile();

		File f2 = new File("Demo2.txt");
		f1.createNewFile();
		
		System.out.println(f1.compareTo(f2));

	}
}
