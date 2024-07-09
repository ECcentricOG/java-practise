interface Parent {

	void fun();
	void gun();
}

abstract class Child1 implements Parent {

	public void fun() {

		System.out.println("Inside fun");
	}
}

class Child2 extends Child1 {

	public void gun() {

		System.out.println("Inside gun");
	}
}

class Client {

	public static void main(String [] args) {

		Parent obj = new Child2();
		obj.fun();
		obj.gun();
	}
}
