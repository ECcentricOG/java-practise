class Demo{

	public static void main(String [] args){

		String s1 = new String("Umesh");
		String s2 = new String("Umesh");

		if(s1 == s2)
			System.out.println("True");
		else
			System.out.println("False");

		if(s1.hashCode() == s2.hashCode())
			System.out.println("True");
		else
			System.out.println("False");
	}
}
/* 		o/p = False
 *  		      True			*/

