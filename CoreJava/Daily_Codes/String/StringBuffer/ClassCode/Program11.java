/* Reverse of the String without using StringBuffer reverse() method */
class Demo{

	static String myReverse(String str){

		char [] ary = str.toCharArray();
		String ans = "";

		for(int i=ary.length-1;i>=0;i--){

			ans += ary[i];
		}
		return ans;
	}

	public static void main(String [] args){

		String str = "Umesh";
		System.out.println(myReverse(str));
	}
}
