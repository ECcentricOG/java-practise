class Demo{

	void fun(float n){

		System.out.println(n);
	}

	public static void main(String [] args){

		Demo obj = new Demo();
		obj.fun(10);
		obj.fun(12.5f);
		obj.fun('U');
	}
}
