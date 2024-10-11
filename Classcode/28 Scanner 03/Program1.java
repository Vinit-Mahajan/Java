import java.io.*;

class Program1{

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter name: ");
		String pName = br.readLine();

		System.out.println("Enter Jersy no: ");
		int jerNo = Integer.parseInt(br.readLine());
		
		System.out.println("Enter the weight: ");
		float wt = Float.parseFloat(br.readLine());

		System.out.println("Enter the char : ");
		char ch = (char)br.read();

		System.out.println("Name: "+pName);
		System.out.println("jNo: "+jerNo);
		System.out.println("Wt: " + wt);
		System.out.println("Char: "+ ch);
	}
	
}
