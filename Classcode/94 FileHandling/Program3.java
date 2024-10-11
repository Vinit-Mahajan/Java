import java.io.*;

class Program3 {
	
	public static void main(String[] args) throws IOException {
	
		File fobj1 = new File("FileHandling");
		fobj1.mkdir();

		File fobj2 = new File(fobj1, "Demo.txt");
		fobj2.createNewFile();
				
	}
}
