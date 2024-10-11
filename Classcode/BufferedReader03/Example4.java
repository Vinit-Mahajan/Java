import java.io.*;
class Example4 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the String : ");
		String str1 = br1.readLine();	
		br1.close();
		
		System.out.println("Enter other String : ");
		String str2 = br2.readLine();
		
		System.out.println("String1 : " + str1);
		System.out.println("String2 : " + str1);


	}
}
