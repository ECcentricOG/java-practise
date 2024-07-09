/* Works on only constant expressions like 1+2 not works on variable like a+b*/
class Demo{

	public static void main(String [] args){
		
		int x = 3;
		int a = 1;
		int b = 2;

		switch(x){
	
			case a:
				System.out.println("1");
				break;
			case b:
				System.out.println("2");
				break;
			case a+b:
				System.out.println("3");
				break;
			default:
				System.out.println("FU");
				break;
		}
	}
}
/*Program5.java:11: error: constant expression required
			case a:
			     ^
Program5.java:14: error: constant expression required
			case b:
			     ^
Program5.java:17: error: constant expression required
			case a+b:
			      ^
*/
