class Demo{

	static{

		System.out.println("Static 1");
	}
	public static void main(String [] args){

		System.out.println("Demo Main");
	}
}
class client{

	static{

		System.out.println("Static 2");
	}
	public static void main(String [] args){

		System.out.println("Client Main");
		Demo obj = new Demo();
	}
	
	static{

		System.out.println("Static 3");
	}
	
}

