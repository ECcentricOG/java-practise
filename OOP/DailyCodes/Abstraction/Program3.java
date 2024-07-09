abstract class Parent {

	abstract void career();

	abstract void marry();
}

abstract class Child1 extends Parent {

	void marry() {

		System.out.println("Girl");
	}
}

class Child2 extends Child1 {

	void career() {

		System.out.println("Engineering");
	}
}

class Client {

	public static void main(String [] args) {

		Parent obj = new Child2();

		obj.career();
		obj.marry();
	}
}
