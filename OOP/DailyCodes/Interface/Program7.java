interface Demo1 {

	default void fun() {

		System.out.println("In Demo1 - fun");
	}
}

interface Demo2 {

	default void fun() {

		System.out.println("In Demo2 - fun");
	}
}

class Child implements Demo1,Demo2 {

	public void fun() {

		System.out.println("In Child fun");
	}
}

class Client {

	public static void main(String [] args) {

		Demo1 obj1 = new Child();
		obj1.fun();

		Demo2 obj2 = new Child();
		obj2.fun();

		Child obj = new Child();
		obj.fun();
	}
}
