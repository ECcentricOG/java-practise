class Demo{

	public static void main(String [] args){

		String str1 = "Umesh";
		String str2 = "Umesh";
		String str3 = new String("Umesh");
		String str4 = new String("Umesh");
		String str5 = new String("Unde");
		String str6 = "Unde";

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		System.out.println(System.identityHashCode(str5));
		System.out.println(System.identityHashCode(str6));
	}
}
