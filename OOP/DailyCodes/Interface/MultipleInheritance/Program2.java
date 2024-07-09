interface Demo1 {

	static void m1() {

		System.out.println("In Demo1-m1");
	}
}

class Child implements Demo1 {

	public static void main(String [] args) {

		Demo1.m1();
	}
}
