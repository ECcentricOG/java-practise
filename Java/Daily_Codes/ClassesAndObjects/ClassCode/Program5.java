class MacD{

	int noOfBurgers = 5;
	String subItem = "Fries";

	void menu(){

		String menu1 = "Veg";
		String menu2 = "Non-Veg";
		System.out.println(noOfBurgers);
		System.out.println(subItem);
	}
}

class User{

	public static void main(String [] args){

		MacD obj = new MacD();
		obj.menu();
	}
}
