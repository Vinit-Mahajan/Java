class Program7 {
	public static void main(String[] args){
		int costPrice = 800;
		int sellPrice = 800;
		int pl = 0;
		
		if(sellPrice > costPrice) {
			pl = sellPrice - costPrice;
			System.out.println("profit of " + pl);
		}
		else {
			pl = costPrice - sellPrice;
			System.out.println("loss of " + pl);
		}

	}
}
