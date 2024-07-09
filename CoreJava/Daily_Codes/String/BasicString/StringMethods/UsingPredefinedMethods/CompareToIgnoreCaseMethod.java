/*5.Compare To Ignore Case :-
 *
 * Method : public int compareToIgnoreCase(String str);
 *
 * Description : 
 * 	It compares str1 and str2 (case Insensitive).
 *
 * 	equal = 0.
 * 	note equal = difference between ascii values of first uncommon elements i.e U and E = 16.
 *
 * Parameter : String
 * return Type : Integer.
 * */
class Demo{

	public static void main(String [] args){

		String str1 = "Umesh";
		String str2 = "umesh";
		String str3 = "ECcentricOG";

		System.out.println(str1.compareToIgnoreCase(str2));
		System.out.println(str1.compareToIgnoreCase(str3));
	}
}
