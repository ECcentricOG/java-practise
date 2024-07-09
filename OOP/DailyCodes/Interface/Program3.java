interface Demo {

	void fun();  		// public abstract void fun();
	void gun();		// public abstract void gun();
}

class Child implements Demo {

	public void fun() {

		System.out.println("In Fun");
	}

	public void gun() {

		System.out.println("In gun");
	}
}

class Clinet {

	public static void main(String [] args) {

		Demo obj = new Child();
		obj.fun();
		obj.gun();
	}
}
