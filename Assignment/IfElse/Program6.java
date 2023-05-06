class Program6 {
	public static void main(String[] arg) {
		int no1 = 1;
		int no2 = 4;
		int no3 = 3;

		if(no1>no2 && no1>no3){
			System.out.println(no1 + " is maximum between " + no1 +" "+ no2 + " " + no3);
		}
		else if(no2 > no1 && no2>no3) {
			System.out.println(no2 + " is maximum between " + no1 +" "+ no2 + " " + no3);
		}
		else
			System.out.println(no3 + " is maximum between " + no1 +" "+ no2 + " " + no3);
	}
}
