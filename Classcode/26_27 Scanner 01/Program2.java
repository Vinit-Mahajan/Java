import java.io.*;

class InputDemo {
	
	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		char x = ' ';
		try{
			x = (char)isr.read();
		}catch(IOException ie) {
		
		}
		System.out.println(x);
	}

}
