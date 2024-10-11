import java.io.*;

class EqualLengthString {


	static int myStrLen(String str) {
	
		char arr[] = str.toCharArray();
		int count = 0;

		for(int i = 0; i < arr.length ; i++) {
		
			count++;
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br.readLine();
		String str2 = br.readLine();

		if(myStrLen(str1) == myStrLen(str2)) {
		
			System.out.println("Equal");
		}
		else {
			System.out.println("Not Equal");
		}

		
	}
}
