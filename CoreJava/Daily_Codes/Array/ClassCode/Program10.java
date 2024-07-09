class Demo{

	public static void main(String [] args){

		int x = 65;
		char ch = 'A';

		System.out.println(System.identityHashCode(x));
		System.out.println(System.identityHashCode(ch));
	}
}
