class Demo {

	Demo () {

		System.out.println("Inside Demo Class Constructor");
	}

	void fun() {

		System.out.println("Inside fun Class");
	}
}

class Client {

	public static void main(String [] args) {

		Demo obj = new Demo() {

		};

		System.out.println("End");
	}
}
