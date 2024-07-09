interface Demo {

	int x = 10;

	void fun();
}

class Asach {

	static int y = 20;

	public void fun() {

		System.out.println("Inside fun");
	}
}

//After Compilation ---------->
/*
 * interface Demo {
 *
 * 	public static final int x;
 *
 * 	public abstract void fun();
 * }
 *
 * class Demo {
 *
 * 	static int y;
 *
 * 	Demo() {
 *
 * 		super(); (invokeSpecial)
 * 	}
 *
 * 	static {
 *
 * 		y = 20 (bipush)
 * 	}
 * }
 */

