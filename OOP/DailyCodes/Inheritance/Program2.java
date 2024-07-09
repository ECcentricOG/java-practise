class Parent{

	Parent(){

		System.out.println("In Parent Constructor");
	}
	void parentProperty(){

		System.out.println("Gold,Flat");
	}
}
class Child extends Parent{

	Child(){

		System.out.println("In Child Constructor");
	}
}
class Client{

	public static void main(String [] args){

		Child obj = new Child();
		obj.parentProperty();
	}
}
