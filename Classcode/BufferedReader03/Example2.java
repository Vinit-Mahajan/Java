import java.io.*;

class Example2 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//System.out.println("Enter Player : ");
		//String name = br.readLine();

		//System.out.println("Enter the Jersy No : ");
		//int jerNo = Integer.parseInt(br.readLine());
		
		System.out.println("Average : ");
		float avg = Float.parseFloat(br.readline());

		//System.out.println("Name :" + name);
		//System.out.println("Jersy No : " + jerNo);
		System.out.println("Average : " + avg);

	}
}
