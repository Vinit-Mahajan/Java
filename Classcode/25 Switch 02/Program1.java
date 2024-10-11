class Program1 {

	public static void main(String[] args) {
	
		String str = "Veg";
		System.out.println(" <<<<<<<< OH.. PUNE >>>>>>");

		switch(str) {
		
			case "Veg":{
			
				String str1 = "starter";
				switch (str1){

					case "starter":
						System.out.println("Masala Papad");
						break;
					case "main course":
						System.out.println("Paneer Masala");
						break;
					default:
						System.out.println("NA");
				}
						
			}break;
				
			case "Non Veg":{
				String str1 = "starter";
				switch(str1) {
				
					case "starter":
						System.out.println("Lolli");
						break;

					case "main courese":
						System.out.println("Chicken Handi");
						break;
					default:
						System.out.println("NA");
				} 		

			}break;
		
		}
	
	}
}
