class Example4 {

	public static void main(String[] args) {
	
		float temp = 98.4f;

		if(temp > 98.6)
			System.out.println("High Temperature");
		else if(temp >= 98.0 && temp <= 98.6)
			System.out.println("Normal Temperature");
		else
			System.out.println("Low Temperature");
	}
}
