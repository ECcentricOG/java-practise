class Demo{

	public static void main(String [] args){

		String str1 = "Umesh";
		String str2 = new String("Unde");
		StringBuffer str3 = new StringBuffer("ECcentricOG");

		StringBuffer str4 = str3.append(str1);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
	}
}
