import java.net.*;
import java.awt.*;
import java.io.*;

class OpenWebsite {

	public static void main(String[] args) throws URISyntaxException, IOException {
	
		String url = "https://www.core2web.in";
		URI obj = new URI(url);
		Desktop desk = Desktop.getDesktop();
		desk.browse(obj);

	}
}
