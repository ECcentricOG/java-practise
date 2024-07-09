class Demo{

	public static void main(String [] args){

		String str1 = "Umesh";
		String str2 = "Unde";

		System.out.println(str1+str2);

		String str3 = "UmeshUnde";
		String str4 = str1+str2;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
