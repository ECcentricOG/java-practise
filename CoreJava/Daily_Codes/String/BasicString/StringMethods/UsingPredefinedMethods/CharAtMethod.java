/*3.Char At :-
 * 
 * Method : public char charAt(int index);
 *
 * Description : 
 * 	It returns the character located at specific index within the given staring.
 *
 * Parameter : Integer (Index)
 * return Type : Character.
 * */

class Demo{

	public static void main(String [] args){

		String s = "Umesh";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(3));
		System.out.println(s.charAt(5));
	}
}

/*
 U
 s
 Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 5
 	at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:47)
 	at java.base/java.lang.String.charAt(String.java:693)
 	at Demo.main(CharAtMethod.java:19)
*/
