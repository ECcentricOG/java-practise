class Demo{

	public static void main(String [] args){

		String str = new String("Umesh");
		String str2 = "Umesh";
		String str3 = new String("Shashi");
		String str4 = "Shashi";


		System.out.println(str.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
	}
}
