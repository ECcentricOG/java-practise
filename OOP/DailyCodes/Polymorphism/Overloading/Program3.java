class Demo extends Object{

	void fun(int x){

		System.out.println(x);
	}

	void fun(float x){

		System.out.println(x);
	}

	void fun(Demo obj){

		System.out.println("In Demo para \n"+obj);
	}

	public static void main(String [] args){

		Demo obj = new Demo();
		obj.fun(10);
		obj.fun(10.5f);

		Demo arg = new Demo();
		obj.fun(arg);
	}
}
