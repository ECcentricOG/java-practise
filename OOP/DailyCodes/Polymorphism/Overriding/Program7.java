class Parent {

	int fun() {
	
		return 10;
	}
}

class Child extends Parent {

	char fun() {

		return 'A';
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
	char fun() {
	     ^
  return type char is not compatible with int
  */

