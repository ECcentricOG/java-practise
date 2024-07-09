class Demo{

	void fun(int [] arr){

		arr[1] = 70;
		arr[2] = 80;
	}

	public static void main(String [] args){

		int [] ary = {10,20,30,40};

		System.out.println(System.identityHashCode(ary[0]));
		System.out.println(System.identityHashCode(ary[1]));
		System.out.println(System.identityHashCode(ary[2]));
		System.out.println(System.identityHashCode(ary[3]));

		for(int x : ary){

			System.out.println(x);
		}	

		Demo obj = new Demo();

		obj.fun(ary);

		int a = 20;
		int b = 30;

		System.out.println(System.identityHashCode(a));
		System.out.println(System.identityHashCode(b));
	}
}
