class Parent {

	Object fun() {

		if(2<4){

			return new Object();
		}

		return 10;
	}
}

class Child extends Parent {

	String fun() {

		return "Umesh";
	}
}

class Client {

	public static void main(String [] args) {

		Parent obj = new Child();
		System.out.println(obj.fun());
	}
}
