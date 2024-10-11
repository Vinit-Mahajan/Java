// This Program only creates "Player.txt" file in which we writing the object of the Player class.
import java.io.*;

class Player implements Serializable{
	
	int jerNo = 0;
	String pName;
	Player(int jerNo, String pName) {
		
		this.jerNo = jerNo;
		this.pName = pName;
	}
	
}
class SerializationDemo {

	public static void main(String[] args) throws IOException {
	
		Player p1 = new Player(1, "KL");
		Player p2 = new Player(45, "Rohit");

		FileOutputStream fos = new FileOutputStream("Player.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(p1);
		oos.writeObject(p2);

		oos.close();
		fos.close();

	}
}
