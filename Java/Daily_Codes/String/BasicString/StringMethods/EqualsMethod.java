/*6.Equals :-
 *
 * Method : public boolean equals(Object anObject);
 *
 * Description : 
 * 	Predicate which compares an objects to this.this is true only if strings with same char sequence.
 * 	return true if anObject is semantically equal to this.
 *
 * Parameter : Object(anObject)
 * return Type : Boolean
 * */

class Demo{

	public static void main(String [] args){

		String str1 = "Umesh";
		String str2 = new String("Umesh");
		String str3 = "umesh";
		String str4 = "ECcentricOG";

		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
	}
}
