class Parent{

	Parent(){

		System.out.println("In Parent Constructor");
	}

	void fun(){

		System.out.println("In parent fun");
	}
}

class Child extends Parent{

	Child(){

		System.out.println("In Child Constructor ");
	}

	void fun(int x){

		System.out.println("In Child fun");
	}
}

class Client{

	public static void main(String [] args){

		Parent obj = new Child();
		obj.fun();
	}
}
