class Parent {

	static void fun() {

		System.out.println("In Parent fun");
	}
}

class Child extends Parent {

	void fun() {

		System.out.println("In Child fun");
	}
}

class Client {

	public static void main(String [] args) {

		Parent obj = new Child();
		obj.fun();
	}
}
/*
 * error: fun() in Child cannot override fun() in Parent
	void fun() {
	     ^
  overridden method is static
*/
