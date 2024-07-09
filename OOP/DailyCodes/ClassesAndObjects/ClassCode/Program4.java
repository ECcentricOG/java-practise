class Demo{

	String name = "OnlineEdu";
	int noOfEmployee = 20;

	void clientInfo(){

		String clientName = "C2W";
		System.out.println(clientName);
		System.out.println(name);
		System.out.println(noOfEmployee);
	}
}

class C2W{

	public static void main(String [] args){

		Demo obj = new Demo();
		obj.clientInfo();
	}
}
