class Parent {

	final void fun() {

		System.out.println("parent fun");
	}
}

class Child extends Parent {

	void fun() {

		System.out.println("Child fun");
	}
}

class Client {

	public static void main(String [] args) {

		Parent obj = new Child();
		obj.fun();
	}
}
/*
 * fun() in Child cannot override fun() in Parent
	void fun() {
	     ^
  overridden method is final
*/
