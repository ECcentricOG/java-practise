class Parent {

	int x = 10;
	static int y = 20;

	Parent() {

		System.out.println("In Parent Constructor");
	}

	void m1() {

		System.out.println("Inside Parent m1");
	}

	static void m2() {

		System.out.println("Inside Parent m2");
	}
}

class Child extends Parent {

	int a = 50;
	static int b = 60;

	Child() {

		System.out.println("Inside Child Constructor");
	}

	void m1() {

		System.out.println("Inside Child m1");
	}

	static void m3() {

		System.out.println("Inside Child m2");
	}
}

class Client {

	public static void main(String [] args) {

		Parent obj = new Parent();

		obj.m1();
		obj.m2();
		//obj.m3();
		
		Child obj1 = new Child();

		obj1.m1();
		//obj1.m2();
		obj1.m3();

		Parent obj2 = new Child();
		obj2.m1();
		obj2.m2();
		//obj2.m3();
	}
}
