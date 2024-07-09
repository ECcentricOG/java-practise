interface Demo {

	void fun();

	default void gun() {

		System.out.println("In Demo gun");
	}
}

class Child implements Demo {

	public void fun() {

		System.out.println("In Child fun");
	}
}

class Client {

	public static void main(String [] args) {

		Demo obj = new Child();
		obj.fun();
		obj.gun();
	}
}
