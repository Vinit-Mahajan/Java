import java.io.*;

class Program5 {

	public static void main(String[] args) {
	
		int count = 0;
		File fobj = new File("/home/charlie/Desktop/Java/Classcode/94 FileHandling");
		System.out.println(fobj.exists());

		String[] files = fobj.list();
		for(String str : files) {
			File f = new File(str);
			if(f.isFile())
				count++;
		}
		System.out.println(count);
	}
}
