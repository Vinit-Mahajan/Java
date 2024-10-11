import java.io.*;
import java.util.Scanner;

class Program2 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
	       	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	

		String str1 = br.readLine();
		System.out.println("str1 : " + str1);
		br.close();

		String str2 = sc.nextLine();
		System.out.println("str2 : " + str2);
		

		
	}

}
