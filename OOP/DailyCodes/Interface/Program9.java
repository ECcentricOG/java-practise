interface Demo {

	static void fun() {

		System.out.println("In Demo fun");
	}
}

class Child implements Demo {

	void gun() {

		System.out.println("In Child gun");
	}
}

class Client {

	public static void main(String [] args) {

		Child obj = new Child();
		obj.gun();
		Demo.fun();
	}
}
