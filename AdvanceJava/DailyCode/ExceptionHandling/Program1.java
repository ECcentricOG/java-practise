class Demo {

	public static void main(String [] args) {

		System.out.println("Start Main");

		try{

			System.out.println(10/0);
		}catch(ArithmeticException e){

			System.out.println("Exception Handled Sucessfully");
		}

		System.out.println("End Main");
	}
}
