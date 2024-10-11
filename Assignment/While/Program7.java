class Program7 {
	public static void main(String[] args) {

		//int no = 7;
		int no = 6;

		if(no%2 == 0) {
			while(no >= 1) {
				System.out.print(no + " ");
				no--;
			}
		}
		
		else {
			while(no >= 1) {
				System.out.print(no + " " );
				no = no - 2;
			}
		}
		System.out.println();
	}	
}  
