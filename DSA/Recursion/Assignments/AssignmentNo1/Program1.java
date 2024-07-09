class Demo {

	static void fun(int x) {

		if(x == 0)
			return;

		fun(x-1);
		System.out.print(x--+" ");
	}

	public static void main(String [] ecc) {

		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
		System.out.println();

		fun(10);
	}
}
