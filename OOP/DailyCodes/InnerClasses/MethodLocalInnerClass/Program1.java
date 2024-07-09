class Demo {

	void fun() {

		System.out.println("Inside Fun");

		class Inner {

			void m1() {

				System.out.println("Inside Inner Class");
			}
		}

		Inner obj = new Inner();
		obj.m1();
	}

	void gun() {

		System.out.println("Inside gun");
	}
}

class Client {

	public static void main(String [] args) {

		Demo obj = new Demo();
		obj.fun();
		obj.gun();
	}
}
