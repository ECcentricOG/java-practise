interface Demo {

	static void fun() {

		System.out.println("In Demo fun");
	}
}

class Child implements Demo {

	void fun() {

		System.out.println("In Child fun");
	}
}

class Client {

	public static void main(String [] args) {

		Child obj = new Child();
		obj.fun();
		Demo.fun();
	}
}
