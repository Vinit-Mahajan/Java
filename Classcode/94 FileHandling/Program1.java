import java.io.*;
class Program1 {

	public static void main(String[] args) {
	
		File fobj = new File("Demo.txt");
		try{
			
			fobj.createNewFile();
		}catch(IOException ie) {
		}
	}
}
