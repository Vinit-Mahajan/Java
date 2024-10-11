import java.io.*;

class Input {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		System.out.println("String : " + str);

		br.close();

		String str2 = br.readLine();
		System.out.println("String2 : " + str2);

		System.out.println("End main");
	}
}
