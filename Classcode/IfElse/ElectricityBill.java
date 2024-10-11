class ElectricityBill {
	public static void main(String[] args){
		int unit=101;, amt;
		if(unit>100){
			unit = unit-100;
			amt = unit*2;
			System.out.println((amt+100) +" is amount");
		}else{
			System.out.println(unit + " is amount");	
		}
	}
}
