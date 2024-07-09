class Outer {

	int x = 10;
	static int y = 20;

	class Inner {

		void innerFun() {

			System.out.println("Inside innerFun");
			System.out.println(x);
			System.out.println(y);
			outerFun();
			outerGun();
		}
	}

	void outerFun() {

		System.out.println("Inside outerFun");
	}

	static void outerGun() {

		System.out.println("Inside outerGun");
	}
}

class Client {

	public static void main(String [] args) {

		Outer.Inner obj = new Outer().new Inner();
		obj.innerFun();
	}
}
