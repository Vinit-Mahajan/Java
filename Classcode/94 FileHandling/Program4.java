import java.io.*;

class Program4 {

	public static void main(String[] args) throws IOException {
	
		File fobj1 = new File("FileDemo");
		fobj1.createNewFile();

			
		System.out.println("getName :"+ fobj1.getName());	
		
		System.out.println("getParent : " + fobj1.getParent());
		
		System.out.println("getParentFile : " + fobj1.getParentFile());
		
		System.out.println("getAbsolutePath : " + fobj1.getAbsolutePath());
		
		System.out.println("canRead : " + fobj1.canRead());
		
		System.out.println("canWrite : " + fobj1.canWrite());

		System.out.println("isDirectory : " + fobj1.isDirectory());
		
		System.out.println("isFile : " + fobj1.isFile());
		
		System.out.println("lastModified : " + fobj1.lastModified());
	}
}
