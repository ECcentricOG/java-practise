class Parent{

	Parent(){

		System.out.println("In Parent Constructor");
	}

	void fun(){

		System.out.println("In fun");
	}
}

class Child extends Parent{

	Child(){

		System.out.println("In Child Constructor");
	}

	void gun(){

		System.out.println("In gun");
	}
}

class Client{

	public static void main(String [] args){

		Child obj1 = new Child();
		obj1.fun();
		obj1.gun();

		Parent obj2 = new Parent();
		obj2.fun();
		obj2.gun();
	}
}

/*
 * cannot find symbol
		obj2.gun();
		    ^
  symbol:   method gun()
  location: variable obj2 of type Parent
*/
