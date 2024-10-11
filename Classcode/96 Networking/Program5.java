import java.io.*;
import java.net.*;
class Server {

	public static void main(String[] args) throws IOException {
	
		ServerSocket ss = new ServerSocket(1200);
		Socket s = ss.accept();

		System.out.println("Connection Establishet");

		OutputStream os = s.getOutputStream();

		PrintStream ps = new PrintStream(os);

		ps.println("Hello Client");
		ps.println("G2H");

		ps.close();
		s.close();
		ss.close();
	}
}
