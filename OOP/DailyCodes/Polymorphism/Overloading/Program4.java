class Demo {

	void fun(int x, float y) {

		System.out.println("int-float");
	}

	void fun(float x,int y) {

		System.out.println("float-int");
	}
}

class Client {

	public static void main(String [] args) {

		Demo obj = new Demo();
		obj.fun(10,10);
	}
}
/*
 * reference to fun is ambiguous
		obj.fun(10,10);
		   ^
  both method fun(int,float) in Demo and method fun(float,int) in Demo match
*/
