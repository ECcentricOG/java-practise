class Parent{

	static{

		System.out.println("In Parent Static");
	}
}

class child extends Parent{

	static{

		System.out.println("In Child Static");
	}
}
class Client{

	public static void main(String [] args){

		System.out.println("In Main");
		Child obj = new Child();
	}
}
