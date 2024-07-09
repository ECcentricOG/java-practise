class Demo{

	int x = 10;
	static int y= 20;

	Demo(){

		System.out.println("In Constructor ");
	}
	static{

		System.out.println("In Static Block 1");
	}
	{

		System.out.println("In Instance Block 1");
	}
	public static void main(String [] args){

		Demo obj = new Demo();
		System.out.println("In Main ");
	}

	static{

		System.out.println("In Static Block 2");
	}
	{

		System.out.println("In Instance Block 2");
	}
}
