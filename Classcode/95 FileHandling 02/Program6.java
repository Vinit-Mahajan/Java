//This is the program of the Deserialization in which we read the Object from the Player.txt file

import java.io.*;

class DeSerialization {

	public static void main(String[] args) throws IOException,ClassNotFoundException {
	
		FileInputStream fis = new FileInputStream("Player.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Player obj1 = (Player)ois.readObject();
		Player obj2 = (Player)ois.readObject();

		ois.close();
		fis.close();

		System.out.println("Jerno : " + obj1.jerNo + "Name : " + obj1.pName);
		System.out.println("Jerno : " + obj2.jerNo + "Name : " + obj2.pName);

	
	}
}
