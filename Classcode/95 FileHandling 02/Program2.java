import java.io.*;

class Program2 {
	
	public static void main(String[] args) throws IOException {
		
		File f = new File("Incubator.txt");
		FileWriter fw = new FileWriter(f, true);

		fw.write("Testing \n");
		fw.write("DevOps \n");
		fw.write("BackEnd \n");

		fw.close();
	
	}
}
