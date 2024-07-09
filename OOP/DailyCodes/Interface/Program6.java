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


}

class Client {

	public static void main(String [] agrs) {

		Child obj = new Child();
	}
}

/*
 *  types Demo1 and Demo2 are incompatible;
class Child implements Demo1,Demo2 {
^
  class Child inherits unrelated defaults for fun() from types Demo1 and Demo2
*/
