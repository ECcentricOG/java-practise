class Demo{

	public static void main(String [] args){

		String str = "Mon";

		switch(str){

			case "Mon":
				System.out.println("Monday");
				break;

			case "Tue":
				System.out.println("Tuesday");
				break;

			default:
				System.out.println("Sunday Funday");
				break;
		}
	}
}
/* before 1.6 it gives error  */ 
