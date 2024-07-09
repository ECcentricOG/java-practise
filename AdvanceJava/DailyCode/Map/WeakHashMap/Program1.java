class Demo {

	String str;

	Demo(String str) {

		this.str = str;
	}

	public String toString() {

		return str;
	}

	public void finalize() {

		System.out.println("Notify");
	}
}

class GCDemo {

	public static void main(String [] ecc) {

		Demo obj1 = new Demo("One");
		Demo obj2 = new Demo("Two");
		Demo obj3 = new Demo("Three");

		System.out.println(obj1);
		System.out.println(obj2);
		System.out.println(obj3);

		obj1 = null;
		obj2 = null;

		System.gc();

		System.out.println("End Main");
	}
}
