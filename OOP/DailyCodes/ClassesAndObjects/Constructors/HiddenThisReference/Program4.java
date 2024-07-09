class Demo{

	int x = 10;

	Demo(){

		System.out.println("No-Args Constructor");
	}

	Demo(int x){

		this();
		System.out.println("Para Constructor");
	}

	public static void main(String [] args){

		Demo obj = new Demo(10);
	}
}
