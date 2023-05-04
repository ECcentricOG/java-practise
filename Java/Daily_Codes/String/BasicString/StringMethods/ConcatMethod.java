/*1.Concat :-
 *
 * Method : public string concat(String str)
 *
 * Description :
 * 	Concatinate to this string i.e Another string is concatinate with the first string.
 * 	Implements new array of character whose length is sum of str1.length + str2.length.
 *
 * Parameter : String
 * return Type : String 		
 * */

class Demo{

	public static void main(String [] args){

		String str = "EC";
		String str2 = "centric";
		String str3 = str.concat(str2);
		
		System.out.println(str3);
	}
}
