class Demo{

	public static void main(String [] args){

		String str = "Umesh";
		String str2 = new String("Umesh");
		String str3 = str + str2;
		String str4 = str.concat(str2);

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
