class Demo{

	public static void main(String [] args){

		int x = 10;
		Integer y = new Integer(10);

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(y));
	}
}
