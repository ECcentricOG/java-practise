class Parent{

	Parent(){

		System.out.println("parent");
	}
}

class Child extends Parent{

	Child(){

		System.out.println("Child ");
	}
}

class Client{

	public static void main(String [] args){

		Parent obj = new Child();		//legal and not error
		Child obj2 = new Parent();		//error
	}
}
/*
 *
 *
 *
 * incompatible types: Parent cannot be converted to Child
		Child obj2 = new Parent();		//error
		             ^
*/

