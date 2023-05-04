/*4.Compare To :-
 *
 * Method : pubic int compareTo(String str);
 *
 * Description :
 * 	It combimes the str1 and str2 (case sensitive) if both strings are equal it returns 0.otherwise returns the comparison.
 *
 * 	equal = 0
 * 	not equal = i) if same length then differece between char ascii values  i.e a & c is 65 - 67 = -2.
 * 		   ii) if different length then difference between first uncommon elements.
 *
 * Parameter : String
 * return Type : Integer
 * */
class Demo{

	public static void main(String [] args){

		String s = "Umesh";
		String s1 = "Umesh";
		String s2 = "umesh";
		String s3 = "ECcentricOG";

		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareTo(s3));
	}
}
 
