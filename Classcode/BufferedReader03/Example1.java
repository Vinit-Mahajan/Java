import java.io.*;
class Example1 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter the Player Name");
		String name = br.readLine();

		System.out.println("Enter the Bowler Name");
		String bow = br.readLine();

		System.out.println("Batsman : " + name);
		System.out.println("Bowler : " + bow);

	}
}
