class Demo {

	void fun(String str) {

		System.out.println("String ");
	}

	void fun(StringBuffer sb) {

		System.out.println("StringBuffer");
	}
}

class Client {

	public static void main(String [] args) {

		Demo obj = new Demo();
		obj.fun(null);
	}
}
/*
 * reference to fun is ambiguous
		obj.fun(null);
		   ^
  both method fun(String) in Demo and method fun(StringBuffer) in Demo match
*/
