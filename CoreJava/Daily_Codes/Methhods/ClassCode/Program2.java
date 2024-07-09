class Demo{

	public static void main(String [] args){

		fun();
		gun();
	}

	static void fun(){

		System.out.println("Inside fun method");
	}

	void gun(){

		System.out.println("Inside gun() method");
	}
}
//error: non-static method gun() cannot be referenced from a static context
//		gun();
//		^

