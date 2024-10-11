import java.io.*;
import java.util.*;

class Example4 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the MallName(String), Section(Char), Item(String), Price(Int), TotalO(Float)");
		String  str = br.readLine(); 

		StringTokenizer st = new StringTokenizer(str, ",");

		String token1 = st.nextToken();

		String token2 = st.nextToken();
		char sec = token2.charAt(0);

		String token3 = st.nextToken();

		String token4 = st.nextToken();
		int price = Integer.parseInt(token4);

		
		String token5 = st.nextToken();
		float total =Float.parseFloat(token5);
		

		System.out.println("Mall Name = " + token1);
		System.out.println("Section = " + sec);
		System.out.println("Item Name = " + token3);
		System.out.println("Price = " + price);
		System.out.println("Total = " + total);

	}
}
