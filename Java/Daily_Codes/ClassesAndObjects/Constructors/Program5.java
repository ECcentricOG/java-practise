class Demo{

	Demo(){

		System.out.println("In Constructor");
	}

	void fun(){

		Demo obj = new Demo();
	}

	public static void main(String [] args){

		Demo obj1 = new Demo();
		Demo obj2 = new Demo();

		obj1.fun();
	}
}
