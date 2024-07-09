class Demo {

	static class Inner {

		void fun() {

			System.out.println("In Demo fun");
		}
	}

	/*public static void main(String [] args) {

		Inner obj = new Inner();
		obj.fun();
	}*/
}

class Client {

	public static void main(String [] args) {

		Demo.Inner obj = new Demo.Inner();
		obj.fun();
	}
}
