import java.io.*;
import java.util.*;
import java.net.*;
class URLConnectionDemo {

	public static void main(String[] args) throws MalformedURLException, IOException {
	
		URL obj = new URL("https://www.core2web.com");
		URLConnection conn = obj.openConnection();
		System.out.println("Last Modified : " + new Date(conn.getLastModified()));
	}
}
