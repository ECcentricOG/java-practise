class Parent{

	Parent(){

		System.out.println("In Parent Constructor");
	}

	void property(){

		System.out.println("Home,Car,Gold");
	}

	void marry(){

		System.out.println("a Girl");
	}
}

class Child extends Parent{

	Child(){

		System.out.println("In Child Constructor");
	}

	void marry(){

		System.out.println("No One");
	}
}

class Client{

	public static void main(String [] args){

		Child obj = new Child();
		obj.property();
		obj.marry();
	}
}
