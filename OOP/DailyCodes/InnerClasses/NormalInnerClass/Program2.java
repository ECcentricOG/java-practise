class Outer {

	class Inner {

		void fun2() {

			System.out.println("Inside fun2");
		}
	}

	void fun1() {

		System.out.println("Inside fun1");
	}



	/*public static void main(String [] args) {

		Inner obj = new Outer().new Inner();
	}*/

}

class Client {

	public static void main(String [] args) {

		Outer obj = new Outer();

		Outer.Inner obj1 = obj.new Inner();   // 	Accessing Inner Class with 
		Outer.Inner obj2 = obj.new Inner();   //	Same Outer Class Object

		Outer.Inner obj3 = new Outer().new Inner();	//	Accessing Inner Class with
		Outer.Inner obj4 = new Outer().new Inner();	//	with new Outer Class object every Time

		obj.fun1();

		obj1.fun2();
		obj2.fun2();

		obj3.fun2();
		obj4.fun2();
	}
}
