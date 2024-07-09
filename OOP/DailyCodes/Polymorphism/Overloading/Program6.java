class Demo {

	void fun(Object obj) {

		System.out.println("Object");
	}

	void fun(String str) {

		System.out.println("String ");
	}
}

class Client {

	public static void main(String [] args) {

		Demo obj = new Demo();
		obj.fun(null);
		obj.fun(new StringBuffer("ECcentricOG"));
		obj.fun("Umesh");
	}
}
