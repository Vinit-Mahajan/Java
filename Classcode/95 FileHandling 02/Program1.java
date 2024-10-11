import java.io.*;

class Program1 {

	public static void main(String[] args) throws IOException {
	
		FileWriter fw = new FileWriter("Incubator.txt");
		fw.write("Flutter");
		fw.write("BackEnd");
		fw.write("FrontEnd");
		fw.close();
	}
}
