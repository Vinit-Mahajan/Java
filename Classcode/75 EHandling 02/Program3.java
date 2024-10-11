import java.io.*;

class ExceptionDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		System.out.println(str);

		//br.close();
		int x;
		try{
			x = Integer.parseInt(br.readLine());
		}catch(NumberFormatException nfe){
			System.out.println("Please the number :  ");
			x = Integer.parseInt(br.readLine());
		}
			System.out.println(x);	
	}		
}
