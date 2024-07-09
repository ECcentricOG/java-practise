class Demo {

	static void fun(int x) {

		if(x == 0)
			return;
		System.out.print(x--+" ");
		fun(x);
	}

	public static void main(String [] ecc) {

		for(int i=10;i>=1;i--)
			System.out.print(i+" ");
		System.out.println();

		fun(10);
	}
}
