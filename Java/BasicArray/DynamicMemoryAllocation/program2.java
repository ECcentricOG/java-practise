class Demo{

	public static void main(String [] args){

		String [] ary = {"Umesh","Umesh"};
		
		System.out.println(System.identityHashCode(ary[0]));
		System.out.println(System.identityHashCode(ary[1]));
		
		System.out.println(System.identityHashCode(args[0]));
		System.out.println(System.identityHashCode(args[1]));

	}
}
