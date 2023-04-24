class Demo{

	public static void main(String [] args){

		int x = 3;

		switch(x){

			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 2:
				System.out.println("Second-2");
				break;
			case 3:
				System.out.println("3");
			default:
				System.out.println("F");
		}
		System.out.println("After Switch");
	}
}
/*Program2.java:15: error: duplicate case label
			case 2:
			^
*/

