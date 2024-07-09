class Demo{

	static String myReplace(String str,int index,char ch){

		char ary [] = str.toCharArray();
		ary[index] = ch;
		String ans = "";
		for(int i=0;i<ary.length;i++){

			ans = ans+ary[i];
		}
		return ans;
	}

	public static void main(String [] args){

		String str = "Emesh Fnde";

		System.out.println(myReplace(str,0,'U'));
		System.out.println(myReplace(str,6,'U'));
	}
}
