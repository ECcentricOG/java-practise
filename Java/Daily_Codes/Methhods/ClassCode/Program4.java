class Demo{

	int a = 10;
	static int b = 20;
	void fun(){

		System.out.println("Inside fun method");
	}

	static void gun(){

		System.out.println("Inside gun method");
	}

	public static void main(String [] args){

		Demo obj = new Demo();

		System.out.println(obj.a);
		System.out.println(b);
		obj.fun();
		gun();
	}
}
