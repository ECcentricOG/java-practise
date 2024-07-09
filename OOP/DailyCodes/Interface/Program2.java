interface Demo {

	void fun();
	void gun();
}

class Client {

	public static void main(String [] args) {

		Demo obj = new Demo();
	}
}

/*
 * Demo is abstract; cannot be instantiated
		Demo obj = new Demo();
		           ^
*/

