class Outer {

	class Inner {

		void fun() {

			System.out.println("In Inner fun");
		}
	}

	void gun() {

		System.out.println("In Outer gun");
	}
}

class Client {

	public static void main(String [] args) {

		Outer outer = new Outer();
		outer.gun();

		Outer.Inner inner1 = new Outer().new Inner();
		Outer.Inner inner2 = outer.new Inner();

		inner1.fun();
		inner2.fun();
	}
}
