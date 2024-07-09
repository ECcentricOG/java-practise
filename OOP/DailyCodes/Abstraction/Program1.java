abstract class Parent {

	void career() {

		System.out.println("Doctor");
	}

	abstract void marry();
}

class Child {

	public static void main(String [] args) {

		Parent obj = new Parent();
	}
}

/*
 *  Parent is abstract; cannot be instantiated
		Parent obj = new Parent();
		             ^
*/
