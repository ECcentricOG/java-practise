class Demo{

	public static void main(String [] args){

		int x = 10;
		int y = 10;

		int a = 200;
		int b = 200;


		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));

	}
}
