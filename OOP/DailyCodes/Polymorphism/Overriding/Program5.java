class Parent{

	Parent(){
	
		System.out.println("In Parent Constructor");
	}

	void fun(int x){

		System.out.println("In Parent fun");
	}
}

class Child extends Parent{

	Child(){

		System.out.println("In Child Constructor");
	}

	void fun(){

		System.out.println("In Child fun");
	}
}

class Client{

	public static void main(String [] args){

		Parent obj = new Child();
		obj.fun();			//Parent doesn't hava fun() 
	}
}
/*
 *
 *  method fun in class Parent cannot be applied to given types;
		obj.fun();			//Parent doesn't hava fun()
		   ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length
*/
